def solution(data,n):
    workers = data[:99]
    for i in workers:
        # Get the occurence of each element
        num_count = data.count(i)
        # Check for occurences of num_count, if greater than given threshold, delete the number from the list
        if num_count > n:
            for t in range(num_count):
                # remove all occcurences of the element
                data.remove(i)
        else:
            continue
    return data
