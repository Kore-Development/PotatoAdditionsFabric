@echo off
FOR /L %%n IN (2,1,30) DO (
copy diy_item_1.png diy_item_%%n.png
)

pause