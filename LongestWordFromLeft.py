def largerstStringFromRight(words):

    arrayOfWords = words.split(" ")
    maxi = 0
    currentMax = ""

    for i in range(len(arrayOfWords)):
        if len(arrayOfWords[i]) >= maxi :
            maxi = len(arrayOfWords[i])
            currentMax = arrayOfWords[i]
        
    print(currentMax)

hello = "hello my name is adarsh masekar fromhali"

largerstStringFromRight(hello)
