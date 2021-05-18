import { binarySearch } from './binarySearch'

describe('Tests binarySearch', () => {
    it('should not find element in empty list', () => {
        const expected = -1
        const actual = binarySearch(3, [])
        expect(actual).toBe(expected)
    })
    it('should not find non existant element', () => {
        const expected = -1
        const actual = binarySearch(3, [1])
        expect(actual).toBe(expected)
    })
    it('should find element', () => {
        const expected = 0
        const actual = binarySearch(1, [1])
        expect(actual).toBe(expected)
    })

    it('should find elements in array with odd number of elements', () => {
        expect(binarySearch(1, [1, 3, 5])).toBe(0)
        expect(binarySearch(3, [1, 3, 5])).toBe(1)
        expect(binarySearch(5, [1, 3, 5])).toBe(2)
    })

    it('should not find elements not present in array with odd number of elements', () => {
        expect(binarySearch(0, [1, 3, 5])).toBe(-1)
        expect(binarySearch(2, [1, 3, 5])).toBe(-1)
        expect(binarySearch(4, [1, 3, 5])).toBe(-1)
        expect(binarySearch(6, [1, 3, 5])).toBe(-1)
    })

    it('should find elements in array with even number of elements', () => {
        expect(binarySearch(1, [1, 3, 5, 7])).toBe(0)
        expect(binarySearch(3, [1, 3, 5, 7])).toBe(1)
        expect(binarySearch(5, [1, 3, 5, 7])).toBe(2)
        expect(binarySearch(7, [1, 3, 5, 7])).toBe(3)
    })

    it('should not find elements not present in array with odd number of elements', () => {
        expect(binarySearch(0, [1, 3, 5, 7])).toBe(-1)
        expect(binarySearch(2, [1, 3, 5, 7])).toBe(-1)
        expect(binarySearch(4, [1, 3, 5, 7])).toBe(-1)
        expect(binarySearch(6, [1, 3, 5, 7])).toBe(-1)
        expect(binarySearch(8, [1, 3, 5, 7])).toBe(-1)
    })
})
