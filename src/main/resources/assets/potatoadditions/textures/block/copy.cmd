@echo off
FOR /L %%n IN (2,1,30) DO (
copy diy_block_1.png diy_block_%%n.png
)

pause