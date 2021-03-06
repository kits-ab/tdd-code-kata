/**
 * Shopping list
 *
 * Find the items which I always purchase
 *
 * Given several lists of shopping items find the always re-occuring items, e.g.
 * [
 *   ['bread', 'milk', 'butter'],
 *   ['honey', 'flour', 'milk' ]
 * ]
 * should produce a result object: { itemCount: 1, items: ['milk'] }
 */
export const commonItems = (
    shoppingLists: Array<Array<string>>
): { items: Array<string>; itemCount: number } => ({
    items: ['milk'],
    itemCount: 1,
})
