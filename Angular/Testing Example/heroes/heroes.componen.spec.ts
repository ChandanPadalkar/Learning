import { Hero } from './../hero';
import { HeroesComponent } from "./heroes.component";
import { of } from "rxjs";

describe('HeroesComponent', () => {

    let component: HeroesComponent;
    let HEROES: Hero[];
    let mockHeroService;

    beforeEach(() => {
        HEROES = [
            { id: 1, name: 'Data1', strength: 8 },
            { id: 2, name: 'Data2', strength: 10 },
            { id: 3, name: 'Data3', strength: 12 }
        ]

        mockHeroService = jasmine.createSpyObj(['getHero', 'addHero', 'deleteHero']);
        component = new HeroesComponent(mockHeroService);
    })

    describe('delete', () => {

        it('should delete indicated heroes from heroes list', () => {
            mockHeroService.deleteHero.and.returnValue(of(true));
            component.heroes = HEROES;
            component.delete(HEROES[2]);

            expect(component.heroes.length).toBe(2);
        })

        // to test calling deleteHero of service
        it('should call deleteHero', () => {
            mockHeroService.deleteHero.and.returnValue(of(true));
            component.heroes = HEROES;
            component.delete(HEROES[2]);

            expect(mockHeroService.deleteHero).toHaveBeenCalledWith(HEROES[2]);
        })
    })

    describe('add', () => {
        it('should add hero into heroes list', () => {
            mockHeroService.addHero.and.returnValue(of(true));
            component.heroes = HEROES;
            component.add('Data4');

            expect(component.heroes.length).toBe(4);
        })
    })
})