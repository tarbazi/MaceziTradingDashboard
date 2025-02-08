import { RouterOutlet } from '@angular/router';
import { Component } from '@angular/core';
import { LoginComponent } from './login/login.component';
import { ClientPageComponent } from './client-page/client-page.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterOutlet, LoginComponent, ClientPageComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}