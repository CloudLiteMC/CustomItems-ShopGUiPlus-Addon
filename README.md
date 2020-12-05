# How do i use this?

Simple, just add a customitem just like you would a regular item!

Below is an entire .yml shop file that displays a custom item with an ID of `CustomItem`

```yml
custom_item_shop:
  name: "&a&lCustom Item Shop &c# %page%"
  fillItem:
    material: LIME_STAINED_GLASS_PANE
    name: " "
  items:
    1:
      type: item
      item:
        customItemsId: "CustomItem"
        quantity: 1
      buyPrice: 2.50
      sellPrice: 2.50
      slot: 10
```
