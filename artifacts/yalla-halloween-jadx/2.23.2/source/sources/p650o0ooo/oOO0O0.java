package p650o0ooo;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.ui.view.pop.memberManagerInfo.MemberManageInfoModel;
import p401o0Oo0O00.OooO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class oOO0O0 extends OooO<MemberManageInfoModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LinearLayout f58940OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f58941OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f58942OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f58943OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f58944OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f58945OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f58946OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public TextView f58947OooOOOo;

    public oOO0O0(FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
        this.f58940OooO.setVisibility(0);
        this.f58941OooOO0.setVisibility(0);
        this.f58942OooOO0O.setText("");
        this.f58943OooOO0o.setText("");
        this.f58945OooOOO0.setText("");
        this.f58944OooOOO.setText("");
        this.f58946OooOOOO.setText("");
        this.f58947OooOOOo.setText("");
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_member_info_layout;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        this.f58940OooO = (LinearLayout) OooO00o(o0OO00O.dialog_member_info_layout_layout_bg);
        this.f58941OooOO0 = (LinearLayout) OooO00o(o0OO00O.dialog_member_info_layout_layout_content);
        this.f58942OooOO0O = (TextView) OooO00o(o0OO00O.dialog_member_info_layout_tv_title);
        this.f58943OooOO0o = (TextView) OooO00o(o0OO00O.dialog_member_info_layout_master_tv);
        this.f58945OooOOO0 = (TextView) OooO00o(o0OO00O.dialog_member_info_layout_manager_tv);
        this.f58944OooOOO = (TextView) OooO00o(o0OO00O.dialog_member_info_layout_member_tv);
        this.f58946OooOOOO = (TextView) OooO00o(o0OO00O.dialog_member_info_layout_del_tv);
        this.f58947OooOOOo = (TextView) OooO00o(o0OO00O.dialog_member_info_layout_content_tv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0o() {
        Model model = this.f43650OooO0o0;
        if (model == 0) {
            return;
        }
        this.f58942OooOO0O.setText(((MemberManageInfoModel) model).getTitle());
        this.f58943OooOO0o.setText(((MemberManageInfoModel) this.f43650OooO0o0).getMaster());
        this.f58945OooOOO0.setText(((MemberManageInfoModel) this.f43650OooO0o0).getManager());
        this.f58944OooOOO.setText(((MemberManageInfoModel) this.f43650OooO0o0).getMember());
        this.f58946OooOOOO.setText(((MemberManageInfoModel) this.f43650OooO0o0).getDel());
        this.f58947OooOOOo.setText(((MemberManageInfoModel) this.f43650OooO0o0).getContent());
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        if (view.getId() == o0OO00O.dialog_member_info_layout_layout_root) {
            OooOO0(this.f43650OooO0o0, AbsListenerTag.Bg);
            if (this.f43651OooO0oO) {
                dismiss();
            }
        }
    }
}
