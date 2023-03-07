from django.shortcuts import render
from django.http import HttpResponse


def home(request):
    text={
        'name' : "Sujal Mishra",
        'age' : 20,
        'phone' : 8770644753,
        'friend' : ['Shreeti','Deepak','Sushil','Saumya','Akshat','Shinu']
    }
    return render(request,'index.html',text)

def about(request):
    return render(request,'about.html')

def contact(request):
    return render(request,'contact.html')