import os
from os import path
import datetime
from datetime import date,time,timedelta
import time
import shutil
from shutil import make_archive
from zipfile import ZipFile
import urllib.request
def printResult(data):
	theJson=json.loads(data)

def main():
	urlData="https://earthquake.usgs.gov/earthquakes/feed/v1.0/summar/2.5"
	webUrl=urllib.request.urlopen(urlData)
	print("result code: " + str(webUrl.getcode()))
	
if __name__=="__main__":
	main()
	
		
		
	
