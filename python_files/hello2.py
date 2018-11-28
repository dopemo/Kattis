from datetime import date
from datetime import time
from datetime import datetime
from datetime import timedelta






def main():
	now=datetime.now()
	print("today is:" + str(now))
	print("one year from now it will be " + str(now+timedelta(days=365)))
	print("in two days and 3 weeks, it will be: "+ str(now+timedelta(days=2, weeks=3)))
	t=datetime.now()-timedelta(weeks=1)
	s=t.strftime("%A %B %d %Y")
	print("One Week ago it was " + s)
	today=date.today()
	afd=date(today.year,4,1)
	print(afd)
	if afd<today:
		print("aprils fools already went by %d days ago" %((today-afd).days))
main()