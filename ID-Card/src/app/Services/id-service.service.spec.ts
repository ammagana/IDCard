import { TestBed } from '@angular/core/testing';

import { IDServiceService } from './id-service.service';

describe('IDServiceService', () => {
  let service: IDServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(IDServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
