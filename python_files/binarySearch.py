def binarySearch(arr,l,r,num):
	if l <= r:
		mid=(l+r)//2
		if num == arr[mid]:
			print("found!")
			print(arr[mid])
		elif num>arr[mid]:
			binarySearch(arr,mid+1,r,num)
		else:
			binarySearch(arr,l,mid-1,num)
	#return 0	
			
def main():
	arr=[1,2,3,4,5,6,7,8,9,10]
	print(arr)
	
	#print(arr)
	binarySearch(arr,0,len(arr)-1,2)
	
main()	