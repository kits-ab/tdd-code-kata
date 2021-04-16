import { symmetric } from './symmetric'

describe('Tests symmetry of list', () => {
    it('should symmetrize list 1', () => {
        const expected = [
            'Bo',
            'Jean',
            'Claude',
            'Marybeth',
            'William',
            'Kevin',
            'Pat',
        ]
        const actual = symmetric([
            'Bo',
            'Pat',
            'Jean',
            'Kevin',
            'Claude',
            'William',
            'Marybeth',
        ])
        expect(actual).toStrictEqual(expected)
    })
    it('should symmetrize list 2', () => {
        const expected = ['Jim', 'Zoe', 'Frederick', 'Annabelle', 'Joey', 'Ben']
        const actual = symmetric([
            'Jim',
            'Ben',
            'Zoe',
            'Joey',
            'Frederick',
            'Annabelle',
        ])
        expect(actual).toStrictEqual(expected)
    })
    it('should symmetrize list 3', () => {
        const expected = ['John', 'Fran', 'Cece', 'Stan', 'Bill']
        const actual = symmetric(['John', 'Bill', 'Fran', 'Stan', 'Cece'])
        expect(actual).toStrictEqual(expected)
    })
})
