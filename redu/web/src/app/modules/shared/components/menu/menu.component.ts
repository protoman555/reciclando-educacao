import { Component, OnInit } from '@angular/core';
import { SegurancaService } from '../../../core/services/seguranca.service';
import { Router } from '@angular/router';

@Component({
    selector: 'redu-menu',
    templateUrl: './menu.component.html',
    styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {

    constructor(public segurancaService: SegurancaService, private router: Router) {

    }

    ngOnInit() {

    }

    public logout() {
        this.segurancaService.logaout();
        this.router.navigate(['inicio']);
    }
}
