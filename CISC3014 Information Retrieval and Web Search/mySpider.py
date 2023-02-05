import scrapy


class Myspider(scrapy.Spider):
	name = 'mySpider'
	start_urls = ["https://www.uberpeople.net/forums/Chicago/?sorting=latest-activity"]
	#/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2
	#
	def parse(self, response):
		# xpath c 语言中文网. 
		products =response.xpath("//div[contains(@class,'structItem-title')]/parent::div") # response.xpath("//div[contains(@class,'structItem-title')]/parent::div")
		for item in products:
			
			#booktitle 
			#需要向上找,就用xpath,而且很多重复. 向下找用css.
			# css 空格变点. 空格是下一层            
			#booktitle = item.css("div.structItem-title a.thread-title--gtm::text").get()                                                                                                    
			title = item.css("a.thread-title--gtm::text").get()
			author = item.css("a.username.thread-details-profile-link--gtm::text").get()
			date = item.css("time.thread-time--gtm.u-dt::text").get()
			link = item.css("a.thread-title--gtm").attrib['href']

			yield{
				"title": title, 
				"link":link,
				"author": author, 
				"date": date,
			}
		

		#这玩意unique直接用
		next_page = response.css("a.pageNav-jump.pageNav-jump--next.california-page-nav-jump-next").attrib['href'] 

		if next_page is not None:
			yield response.follow(next_page, callback=self.parse)

# scrapy crawl mySpider -o ./log.json


	

