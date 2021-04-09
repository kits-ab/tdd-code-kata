import { fizzbuzz } from './fizzbuzz'

describe('fizzbuzz', () => {
    test('test 1', () => {
        const result = fizzbuzz([2, 3, 7])
        const expected = ['1', 'Fizz', 'Buzz', 'Fizz', '5', 'FizzBuzz', '7']
        expect(result).toStrictEqual(expected)
    })
    test('test 2', () => {
        const result = fizzbuzz([2, 4, 7])
        const expected = ['1', 'Fizz', '3', 'FizzBuzz', '5', 'Fizz', '7']
        expect(result).toStrictEqual(expected)
    })
    test('test 3', () => {
        const result = fizzbuzz([3, 5, 7])
        const expected = ['1', '2', 'Fizz', '4', 'Buzz', 'Fizz', '7']
        expect(result).toStrictEqual(expected)
    })
})
