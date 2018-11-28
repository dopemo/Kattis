from urllib.request import Request, urlopen
from urllib.error import URLError
req = Request('http://www.google.com')
try:
	response=urlopen(req)
except URLError as e:
	if hasattr(e,'reason'):
		print('we failed to reach a server')
		print('Reason: ', e.reason)
	elif hasattr(e,'code'):
		print('the server could not be fulfilled the request.')
		print('Error code: ', e.code)
else:
	print("everthing is fine")