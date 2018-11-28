def merge(arr,l,m,r):
	n1=m-l+1
	n2=r-m
	L=[0]*(n1)
	R=[0]*(n2)
	for i in range(n1):
		L[i]=arr[l+i]
	for j in range(n2):
		R[j]=arr[m+1+j]
		
	i=0
	j=0
	k=l
	while i < n1 and j<n2:
		if L[i]<=R[j]:
			arr[k]=L[i]
			i+=1
		else:
			arr[k]=R[j]
			j+=1
		k+=1
	while i < n1:
		arr[k]=L[i]
		i+=1
		k+=1
	while j<n2:
		arr[k]=R[j]
		j+=1
		k+=1
def mergeSort(arr,l,r):
		if l<r:
			m=(l+(r-1))//2
			mergeSort(arr,l,m)
			mergeSort(arr,m+1,r)
			merge(arr,l,m,r)
def binarySearch(arr,l,r,num):
	if l <=r:
		mid=(l+r)//2
		if num == arr[mid]:
			print("number " + str(arr[mid]))
		elif num>arr[mid]:
			binarySearch(arr,mid+1,r,num)
		else:
			binarySearch(arr,l,mid-1,num)
	return 0	
			
def main():
	arr=[7,2,3,8,10,9,4,0]
	print(arr)
	mergeSort(arr,0,len(arr)-1)
	print(arr)
	binarySearch(arr,0,len(arr)-1,10)
	
main()	