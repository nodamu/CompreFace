import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ApplicationUserListComponent} from './application-user-list.component';
import {ApplicationUserListFacade} from './application-user-list-facade';
import {UserTableModule} from '../user-table/user-table.module';
import {SpinnerModule} from 'src/app/features/spinner/spinner.module';
import {InviteUserModule} from '../invite-user/invite-user.module';
import {UserTablePipeModule} from '../../ui/search-pipe/user-table-filter.module';
import {MatInputModule} from '@angular/material/input';
import {FormsModule} from '@angular/forms';
import {MatButtonModule} from '@angular/material';
import {InviteDialogComponent} from '../invite-dialog/invite-dialog.component';
import {InviteDialogModule} from '../invite-dialog/invite-dialog.module';

@NgModule({
  declarations: [ApplicationUserListComponent],
  exports: [ApplicationUserListComponent],
  providers: [ApplicationUserListFacade],
  imports: [
    CommonModule,
    UserTableModule,
    SpinnerModule,
    InviteUserModule,
    FormsModule,
    UserTablePipeModule,
    MatInputModule,
    MatButtonModule,
    InviteDialogModule
  ],
  entryComponents: [InviteDialogComponent]
})
export class AppUserListModule {}