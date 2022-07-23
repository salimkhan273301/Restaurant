import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VeiwItemsComponent } from './veiw-items.component';

describe('VeiwItemsComponent', () => {
  let component: VeiwItemsComponent;
  let fixture: ComponentFixture<VeiwItemsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VeiwItemsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VeiwItemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
