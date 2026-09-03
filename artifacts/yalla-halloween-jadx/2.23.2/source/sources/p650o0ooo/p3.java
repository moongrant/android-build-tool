package p650o0ooo;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import p473o0OoooOo.o0OOO0;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class p3 extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f59094OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FragmentActivity f59095OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ImageView f59096OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Window f59097OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public NetImageView f59098OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f59099OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f59100OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f59101OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f59102OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o0OOO0 f59103OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o0OOO0 f59104OooOOO0;

    public p3(PremiumActivity premiumActivity) {
        super(premiumActivity);
        this.f59095OooO0Oo = premiumActivity;
        Window window = getWindow();
        this.f59097OooO0o0 = window;
        window.setWindowAnimations(o000000O.anim_bottom_top_bottom);
        this.f59097OooO0o0.requestFeature(1);
        this.f59097OooO0o0.setContentView(oo0o0Oo.dialog_subscription_member);
        this.f59097OooO0o0.setBackgroundDrawableResource(o0OOO0o.transparent);
        this.f59097OooO0o0.setDimAmount(0.3f);
        this.f59097OooO0o0.setGravity(80);
        WindowManager.LayoutParams attributes = this.f59097OooO0o0.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        this.f59097OooO0o0.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
        this.f59096OooO0o = (ImageView) this.f59097OooO0o0.findViewById(o0OO00O.dialog_subscription_member_iv_close);
        this.f59098OooO0oO = (NetImageView) this.f59097OooO0o0.findViewById(o0OO00O.dialog_subscription_member_header);
        this.f59099OooO0oo = (TextView) this.f59097OooO0o0.findViewById(o0OO00O.dialog_subscription_member_tv_purchase);
        this.f59094OooO = (TextView) this.f59097OooO0o0.findViewById(o0OO00O.dialog_subscription_member_tv_name);
        this.f59100OooOO0 = (TextView) this.f59097OooO0o0.findViewById(o0OO00O.dialog_subscription_member_tv_info);
        this.f59101OooOO0O = (TextView) this.f59097OooO0o0.findViewById(o0OO00O.dialog_subscription_member_tv_subscribe_now);
        this.f59102OooOO0o = (TextView) this.f59097OooO0o0.findViewById(o0OO00O.dialog_subscription_member_tv_instructions_content);
        this.f59096OooO0o.setOnClickListener(this);
        this.f59099OooO0oo.setOnClickListener(this);
        this.f59101OooOO0O.setOnClickListener(this);
        try {
            getWindow().getDecorView().setSystemUiVisibility(4866);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == o0OO00O.dialog_subscription_member_iv_close) {
            dismiss();
            return;
        }
        if (id == o0OO00O.dialog_subscription_member_tv_purchase) {
            o0OOO0 o0ooo1 = this.f59104OooOOO0;
            if (o0ooo1 != null) {
                o0ooo1.OooO0O0();
            }
            dismiss();
            return;
        }
        if (id == o0OO00O.dialog_subscription_member_tv_subscribe_now) {
            o0OOO0 o0ooo2 = this.f59103OooOOO;
            if (o0ooo2 != null) {
                o0ooo2.OooO0O0();
            }
            dismiss();
        }
    }
}
