import turtle
import random
# 创建一个 Turtle 对象
t = turtle.Turtle()

# 设置屏幕的背景颜色
turtle.bgcolor("lightblue")

# 隐藏乌龟
t.hideturtle()

# 设置随机种子（可选）
# random.seed()

# 随机选择线条的数量
num_lines = random.randint(5, 15)  # 随机选择 5 到 15 条线

for _ in range(num_lines):
    # 随机选择每条线的长度和转动角度
    line_length = random.randint(50, 150)  # 随机选择线的长度
    angle = random.randint(0, 360)  # 随机选择转动的角度

    # 绘制线条
    t.forward(line_length)  # 前进一定的长度
    t.right(angle)          # 右转指定的角度

# 完成绘图
#turtle.done()
turtle.exitonclick()