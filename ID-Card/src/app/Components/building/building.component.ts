import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Building } from 'src/app/Models/Building';
import { IDServiceService } from 'src/app/Services/id-service.service';

@Component({
  selector: 'app-building',
  templateUrl: './building.component.html',
  styleUrls: ['./building.component.css']
})
export class BuildingComponent {
  constructor(private idService:IDServiceService){}
    getBuilding():Observable<Building[]>{
      return this.idService.getBuildings();
  }
}
