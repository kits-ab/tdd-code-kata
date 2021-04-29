import { frequencySort } from './sort'

describe('Tests sorting by frequency', () => {
    test('Sorts most common first', () => {
        const input = [2, 1, 2, 1, 2]
        const expected = [2, 2, 2, 1, 1]
        expect(frequencySort(input)).toBe(expected)
    })
    test('Sorts in order of appearance', () => {
        const input = [1, 3, 3, 3, 2, 2, 1, 1]
        const expected = [1, 1, 1, 3, 3, 3, 2, 2, 2]
        expect(frequencySort(input)).toBe(expected)
    })
    test('Sorts most common first then in order of appearance', () => {
        const input = [11, 33, 11, 77, 54, 11, 25, 25, 33]
        const expected = [11, 11, 11, 33, 33, 25, 25, 77, 54]
        expect(frequencySort(input)).toBe(expected)
    })
})
