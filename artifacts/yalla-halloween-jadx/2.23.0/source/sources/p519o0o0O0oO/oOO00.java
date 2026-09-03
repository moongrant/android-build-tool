package p519o0o0O0oO;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.ui.view.pop.memberManagerInfo.MemberManageInfoModel;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class oOO00 extends OooOO0<MemberManageInfoModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public LinearLayout f52909OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f52910OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f52911OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f52912OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public TextView f52913OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f52914OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f52915OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public TextView f52916OooOOOo;

    public oOO00(FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
        this.f52909OooO.setVisibility(0);
        this.f52910OooOO0.setVisibility(0);
        this.f52911OooOO0O.setText("");
        this.f52912OooOO0o.setText("");
        this.f52914OooOOO0.setText("");
        this.f52913OooOOO.setText("");
        this.f52915OooOOOO.setText("");
        this.f52916OooOOOo.setText("");
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.dialog_member_info_layout;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        this.f52909OooO = (LinearLayout) OooO00o(oO00O0oO.dialog_member_info_layout_layout_bg);
        this.f52910OooOO0 = (LinearLayout) OooO00o(oO00O0oO.dialog_member_info_layout_layout_content);
        this.f52911OooOO0O = (TextView) OooO00o(oO00O0oO.dialog_member_info_layout_tv_title);
        this.f52912OooOO0o = (TextView) OooO00o(oO00O0oO.dialog_member_info_layout_master_tv);
        this.f52914OooOOO0 = (TextView) OooO00o(oO00O0oO.dialog_member_info_layout_manager_tv);
        this.f52913OooOOO = (TextView) OooO00o(oO00O0oO.dialog_member_info_layout_member_tv);
        this.f52915OooOOOO = (TextView) OooO00o(oO00O0oO.dialog_member_info_layout_del_tv);
        this.f52916OooOOOo = (TextView) OooO00o(oO00O0oO.dialog_member_info_layout_content_tv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0o() {
        Model model = this.f44398OooO0o0;
        if (model == 0) {
            return;
        }
        this.f52911OooOO0O.setText(((MemberManageInfoModel) model).getTitle());
        this.f52912OooOO0o.setText(((MemberManageInfoModel) this.f44398OooO0o0).getMaster());
        this.f52914OooOOO0.setText(((MemberManageInfoModel) this.f44398OooO0o0).getManager());
        this.f52913OooOOO.setText(((MemberManageInfoModel) this.f44398OooO0o0).getMember());
        this.f52915OooOOOO.setText(((MemberManageInfoModel) this.f44398OooO0o0).getDel());
        this.f52916OooOOOo.setText(((MemberManageInfoModel) this.f44398OooO0o0).getContent());
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        if (view.getId() == oO00O0oO.dialog_member_info_layout_layout_root) {
            OooOO0(this.f44398OooO0o0, AbsListenerTag.Bg);
            if (this.f44399OooO0oO) {
                dismiss();
            }
        }
    }
}
