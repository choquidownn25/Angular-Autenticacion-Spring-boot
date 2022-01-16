import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = '';
  description = '';
  constructor(private http: HttpClient) {
  
  }
  ngOnInit() {
    this.http.get("http://localhost:8003/nombre",{responseType: 'text' }).subscribe((data:any) =>{
      this.title = data;
    }), (err:any) => {
      console.log(err)
    }
    this.http.get("http://localhost:8003/descripcion",{responseType: 'text' }).subscribe((data:any) =>{
      this.description = data;
    }), (err:any) => {
      console.log(err)
    }
  }
  
}
