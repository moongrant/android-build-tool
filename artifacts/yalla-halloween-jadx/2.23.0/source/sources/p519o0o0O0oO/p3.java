package p519o0o0O0oO;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import p466o0Oooo0o.oOO00O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;

/* JADX INFO: loaded from: classes4.dex */
public final class p3 extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f53076OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FragmentActivity f53077OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ImageView f53078OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Window f53079OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public NetImageView f53080OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f53081OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f53082OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f53083OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f53084OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public oOO00O f53085OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public oOO00O f53086OooOOO0;

    public p3(PremiumActivity premiumActivity) {
        super(premiumActivity);
        this.f53077OooO0Oo = premiumActivity;
        Window window = getWindow();
        this.f53079OooO0o0 = window;
        window.setWindowAnimations(oO00Oo00.anim_bottom_top_bottom);
        this.f53079OooO0o0.requestFeature(1);
        this.f53079OooO0o0.setContentView(oO00OO0O.dialog_subscription_member);
        this.f53079OooO0o0.setBackgroundDrawableResource(oO00O0o.transparent);
        this.f53079OooO0o0.setDimAmount(0.3f);
        this.f53079OooO0o0.setGravity(80);
        WindowManager.LayoutParams attributes = this.f53079OooO0o0.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        this.f53079OooO0o0.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
        this.f53078OooO0o = (ImageView) this.f53079OooO0o0.findViewById(oO00O0oO.dialog_subscription_member_iv_close);
        this.f53080OooO0oO = (NetImageView) this.f53079OooO0o0.findViewById(oO00O0oO.dialog_subscription_member_header);
        this.f53081OooO0oo = (TextView) this.f53079OooO0o0.findViewById(oO00O0oO.dialog_subscription_member_tv_purchase);
        this.f53076OooO = (TextView) this.f53079OooO0o0.findViewById(oO00O0oO.dialog_subscription_member_tv_name);
        this.f53082OooOO0 = (TextView) this.f53079OooO0o0.findViewById(oO00O0oO.dialog_subscription_member_tv_info);
        this.f53083OooOO0O = (TextView) this.f53079OooO0o0.findViewById(oO00O0oO.dialog_subscription_member_tv_subscribe_now);
        this.f53084OooOO0o = (TextView) this.f53079OooO0o0.findViewById(oO00O0oO.dialog_subscription_member_tv_instructions_content);
        this.f53078OooO0o.setOnClickListener(this);
        this.f53081OooO0oo.setOnClickListener(this);
        this.f53083OooOO0O.setOnClickListener(this);
        try {
            getWindow().getDecorView().setSystemUiVisibility(4866);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == oO00O0oO.dialog_subscription_member_iv_close) {
            dismiss();
            return;
        }
        if (id == oO00O0oO.dialog_subscription_member_tv_purchase) {
            oOO00O ooo00o = this.f53086OooOOO0;
            if (ooo00o != null) {
                ooo00o.OooO00o();
            }
            dismiss();
            return;
        }
        if (id == oO00O0oO.dialog_subscription_member_tv_subscribe_now) {
            oOO00O ooo00o2 = this.f53085OooOOO;
            if (ooo00o2 != null) {
                ooo00o2.OooO00o();
            }
            dismiss();
        }
    }
}
