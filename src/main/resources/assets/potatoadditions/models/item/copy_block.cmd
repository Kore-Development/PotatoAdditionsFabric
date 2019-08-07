@echo off
FOR /L %%n IN (2,1,30) DO (
copy diy_block_1.json diy_block_%%n.json
echo {"parent":"potatoadditions:block/diy_block_%%n"} > diy_block_%%n.json
)

pause