import { TestBed, ComponentFixture } from "@angular/core/testing";
import { HeroComponent } from "./hero.component";
import { By } from "@angular/platform-browser";

describe('HeroComponent (shallow test)', () => {

    let fixture: ComponentFixture<HeroComponent>;

    beforeEach(() => {
        TestBed.configureTestingModule({
            declarations: [HeroComponent]
        });

        fixture = TestBed.createComponent(HeroComponent);
    });

    it('should have correct hero', () => {
        fixture.componentInstance.hero = { id: 1, name: 'Data3', strength: 4 };

        expect(fixture.componentInstance.hero).toEqual('Data3');
    })

    it('should render herp nam ein anchor tag', () => {
        fixture.componentInstance.hero = { id: 1, name: 'Data3', strength: 4 };
        fixture.detectChanges();

        let deA = fixture.debugElement.nativeElement.query(By.css('a'));
        expect(deA.textContent).toContain('Data3');

        expect(fixture.nativeElement.querySelector('a').textCotent).toContain('Data3');
    })
})