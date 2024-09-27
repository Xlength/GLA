import turtle

# turtle.shape("turtle") # "arrow", "turtle", "circle", "square", "triangle", "classic"
# # turtle.hideturtle() # hide the turtle
# turtle.circle(100) #用circle画圆
# #turtle.done()

# turtle.exitonclick()

'''
14 - Draw an octagon that uses a different colour (randomly selected from a list of six possible 
colours) for each line.
'''
# turtle在jupyter notebook上一次可以运行，下次不可以！

turtle.shape("arrow")

for i in range (8):
    turtle.forward(100)
    turtle.left(45)
    #turtle.right(45)
turtle.exitonclick()
