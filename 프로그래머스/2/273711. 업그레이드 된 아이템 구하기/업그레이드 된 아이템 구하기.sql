-- 코드를 작성해주세요
select a.ITEM_ID, a.ITEM_NAME, a.RARITY
from ITEM_INFO as a 
where a.ITEM_ID in (select tree.ITEM_ID
    from ITEM_INFO as info  inner join ITEM_TREE as tree on info.ITEM_ID = tree.PARENT_ITEM_ID
                   where RARITY = 'RARE')
order by a.ITEM_ID desc