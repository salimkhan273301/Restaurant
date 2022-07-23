import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VeiwOdersComponent } from './veiw-oders.component';

describe('VeiwOdersComponent', () => {
  let component: VeiwOdersComponent;
  let fixture: ComponentFixture<VeiwOdersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VeiwOdersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VeiwOdersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
