import { commonItems } from './shopping'

describe('Tests common items', () => {
    test('Should handle correct types', () => {
        const result = commonItems([[]])
        expect(result).toEqual({ itemCount: 0, items: [] })
    })
    test('Should handle no common items', () => {
        const result = commonItems([['bread'], ['carrots']])
        expect(result).toEqual({ itemCount: 0, items: [] })
    })
    test('Should find milk', () => {
        const result = commonItems([
            ['bread', 'milk', 'butter'],
            ['honey', 'flour', 'milk'],
        ])
        expect(result).toEqual({
            itemCount: 1,
            items: ['milk'],
        })
    })
    test('Should find common items', () => {
        const result = commonItems([
            ['bread', 'carrots', 'cheese', 'eggs', 'milk'],
            ['milk', 'carrots', 'bread', 'pasta', 'yogurt'],
            ['corn', 'bread', 'kale', 'spinach', 'carrots'],
            ['milk', 'bread', 'cheese', 'carrots', 'yogurt'],
        ])
        expect(result).toEqual({
            itemCount: 2,
            items: ['bread', 'carrots'],
        })
    })
})
