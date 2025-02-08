import { RouterOutlet } from '@angular/router';
import { Component } from '@angular/core';
import { BlogComponent } from './blog/blog.component';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [RouterOutlet, BlogComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

}
