import requests
url_endpoint = 'https://www.duckduckgo.com'
mydict = {'q': 'whee! Stanford!!!', 'something': 'else'}
resp = requests.get(url_endpoint, params=mydict)
print(mydict)