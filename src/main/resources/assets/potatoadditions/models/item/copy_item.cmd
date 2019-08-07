@echo off
FOR /L %%n IN (2,1,30) DO (
copy diy_item_1.json diy_item_%%n.json
echo {"parent":"item/generated","textures":{"layer0":"potatoadditions:item/diy_item_%%n"}} > diy_item_%%n.json
)

pause