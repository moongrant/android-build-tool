package p139o00OOOo0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.view.pop.memberManagerInfo.MemberManageInfoModel;
import com.weieyu.yalla.R;
import p146o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ResourceAsColor"})
public final class o000O00 extends OooO0O0<MemberManageInfoModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f31773OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public LinearLayout f31774OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public LinearLayout f31775OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f31776OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f31777OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public TextView f31778OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public TextView f31779OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TextView f31780o000oOoO;

    public o000O00(Context context) {
        super(context, 0);
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
        this.f31774OoooO0.setVisibility(0);
        this.f31775OoooO0O.setVisibility(0);
        this.f31773OoooO.setText("");
        this.f31776OoooOO0.setText("");
        this.f31780o000oOoO.setText("");
        this.f31777OoooOOO.setText("");
        this.f31778OoooOOo.setText("");
        this.f31779OoooOo0.setText("");
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_member_info_layout;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        this.f31774OoooO0 = (LinearLayout) OooO00o(R.id.dialog_member_info_layout_layout_bg);
        this.f31775OoooO0O = (LinearLayout) OooO00o(R.id.dialog_member_info_layout_layout_content);
        this.f31773OoooO = (TextView) OooO00o(R.id.dialog_member_info_layout_tv_title);
        this.f31776OoooOO0 = (TextView) OooO00o(R.id.dialog_member_info_layout_master_tv);
        this.f31780o000oOoO = (TextView) OooO00o(R.id.dialog_member_info_layout_manager_tv);
        this.f31777OoooOOO = (TextView) OooO00o(R.id.dialog_member_info_layout_member_tv);
        this.f31778OoooOOo = (TextView) OooO00o(R.id.dialog_member_info_layout_del_tv);
        this.f31779OoooOo0 = (TextView) OooO00o(R.id.dialog_member_info_layout_content_tv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO() {
        Model model = this.f32153Oooo0oO;
        if (model == 0) {
            return;
        }
        this.f31773OoooO.setText(((MemberManageInfoModel) model).getTitle());
        this.f31776OoooOO0.setText(((MemberManageInfoModel) this.f32153Oooo0oO).getMaster());
        this.f31780o000oOoO.setText(((MemberManageInfoModel) this.f32153Oooo0oO).getManager());
        this.f31777OoooOOO.setText(((MemberManageInfoModel) this.f32153Oooo0oO).getMember());
        this.f31778OoooOOo.setText(((MemberManageInfoModel) this.f32153Oooo0oO).getDel());
        this.f31779OoooOo0.setText(((MemberManageInfoModel) this.f32153Oooo0oO).getContent());
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        if (view.getId() == R.id.dialog_member_info_layout_layout_root) {
            OooOO0(AbsListenerTag.Bg);
            if (this.f32151Oooo) {
                dismiss();
            }
        }
    }
}
