package com.twitter.sdk.android.core.identity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p054o00000oo.o00O000;
import p431o0OoOO.Oooo0;
import p431o0OoOO.Oooo000;
import p431o0OoOO.o00O0O;
import p431o0OoOO.o0OoOo0;
import p433o0OoOO0o.o0O000Oo;
import p433o0OoOO0o.o0O000o0;
import p433o0OoOO0o.o0O00O0o;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0O0oo0o;
import p433o0OoOO0o.o0OoOoOo;
import p433o0OoOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
public class TwitterLoginButton extends Button {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o0O0o<o0O0O0Oo> f19955Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final WeakReference<Activity> f19956Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public volatile o00O0O f19957Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View.OnClickListener f19958Oooo0oo;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (TwitterLoginButton.this.f19955Oooo == null) {
                o00O000.OooO0O0("Callback must not be null, did you call setCallback?");
            }
            Activity activity = TwitterLoginButton.this.f19956Oooo0o.get();
            if (activity == null || activity.isFinishing()) {
                o00O000.OooO0O0("TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
            }
            o00O0O twitterAuthClient = TwitterLoginButton.this.getTwitterAuthClient();
            Activity activity2 = TwitterLoginButton.this.f19956Oooo0o.get();
            o0O0o<o0O0O0Oo> o0o0o = TwitterLoginButton.this.f19955Oooo;
            Objects.requireNonNull(twitterAuthClient);
            if (activity2 == null) {
                throw new IllegalArgumentException("Activity must not be null.");
            }
            if (o0o0o == null) {
                throw new IllegalArgumentException("Callback must not be null.");
            }
            if (activity2.isFinishing()) {
                o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Cannot authorize, activity is finishing.", null);
            } else {
                o00O0O.OooO0O0 oooO0O0 = new o00O0O.OooO0O0(twitterAuthClient.f39910OooO0O0, o0o0o);
                PackageManager packageManager = activity2.getPackageManager();
                boolean zOooO00o = false;
                if (o0OoOo0.OooO0O0(packageManager, "com.twitter.android", "3082025d308201c6a00302010202044bd76cce300d06092a864886f70d01010505003073310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f31163014060355040a130d547769747465722c20496e632e310f300d060355040b13064d6f62696c65311630140603550403130d4c656c616e6420526563686973301e170d3130303432373233303133345a170d3438303832353233303133345a3073310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f31163014060355040a130d547769747465722c20496e632e310f300d060355040b13064d6f62696c65311630140603550403130d4c656c616e642052656368697330819f300d06092a864886f70d010101050003818d003081890281810086233c2e51c62232d49cc932e470713d63a6a1106b38f9e442e01bc79ca4f95c72b2cb3f1369ef7dea6036bff7c4b2828cb3787e7657ad83986751ced5b131fcc6f413efb7334e32ed9787f9e9a249ae108fa66009ac7a7932c25d37e1e07d4f9f66aa494c270dbac87d261c9668d321c2fba4ef2800e46671a597ff2eac5d7f0203010001300d06092a864886f70d0101050500038181003e1f01cb6ea8be8d2cecef5cd2a64c97ba8728aa5f08f8275d00508d64d139b6a72c5716b40a040df0eeeda04de9361107e123ee8d3dc05e70c8a355f46dbadf1235443b0b214c57211afd4edd147451c443d49498d2a7ff27e45a99c39b9e47429a1dae843ba233bf8ca81296dbe1dc5c5434514d995b0279246809392a219b") || o0OoOo0.OooO0O0(packageManager, "com.twitter.android.beta", "308203523082023aa00302010202044fd0006b300d06092a864886f70d0101050500306b310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130754776974746572310f300d060355040b13064d6f62696c65311430120603550403130b4a6f6e617468616e204c65301e170d3132303630373031313431395a170d3339313032343031313431395a306b310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130754776974746572310f300d060355040b13064d6f62696c65311430120603550403130b4a6f6e617468616e204c6530820122300d06092a864886f70d01010105000382010f003082010a028201010089e6cbdfed4288a9c0a215d33d4fa978a5bdd20be426ef4b497d358a9fd1c6efec9684f059f6955e60e5fda1b5910bb2d097e7421a78f9c81e95cd8ef3bf50add7f8d9f073c0478736a6c7fd38c5871559783a76420d37f3f874f2114ec02532e85587791d24037485b1b95ec8cbc75b52042867988b51c7c3589d5b5972fd20a2e8a7c9ced986873f5008a418b2921daa7cfb78afc174eecdb8a79dc0961bea9740d09c4656ac9b8c86263a788e35af1d4a3f86ce053a1aefb5369def91614a390219f896f378712376baa05934a341798950e229f4f735b86004952b259f23cc9fc3b8c1bc8171984884dc92940e91f2e9a78a84a78f0c2946b7e37bbf3b9b0203010001300d06092a864886f70d010105050003820101001cf15250365e66cc87bb5054de1661266cf87907841016b20dfa1f9f59842020cbc33f9b4d41717db0428d11696a0bade6a4950a48cc4fa8ae56c850647379a5c2d977436b644162c453dd36b7745ccb9ff0b5fc070125024de73dab6dcda5c69372e978a49865f569927199ed0f61d7cbee1839079a7da2e83f8c90f7421a8c81b3f17f1cc05d52aedac9acd6e092ffd9ad572960e779a5b91a78e1aeb2b3c7b24464bd223c745e40abd74fc586310809520d183443fcca3c6ade3be458afedbd3325df9c0e552636e35bb55b240eb8c0ba3973c4fb81213f22363be2d70e85014650c2f4fc679747a7ec31ea7b08da7dd9b9ba279a7fbbc1bd440fbe831bf4")) {
                    o0oO0Ooo.OooO0OO().OooO0OO("Twitter", "Using SSO");
                    Oooo000 oooo000 = twitterAuthClient.f39909OooO00o;
                    TwitterAuthConfig twitterAuthConfig = twitterAuthClient.f39911OooO0OO;
                    Objects.requireNonNull(twitterAuthConfig);
                    zOooO00o = oooo000.OooO00o(activity2, new o0OoOo0(twitterAuthConfig, oooO0O0));
                }
                if (!zOooO00o) {
                    o0oO0Ooo.OooO0OO().OooO0OO("Twitter", "Using OAuth");
                    Oooo000 oooo001 = twitterAuthClient.f39909OooO00o;
                    TwitterAuthConfig twitterAuthConfig2 = twitterAuthClient.f39911OooO0OO;
                    Objects.requireNonNull(twitterAuthConfig2);
                    if (!oooo001.OooO00o(activity2, new Oooo0(twitterAuthConfig2, oooO0O0))) {
                        oooO0O0.OooO0OO(new TwitterAuthException("Authorize failed."));
                    }
                }
            }
            View.OnClickListener onClickListener = TwitterLoginButton.this.f19958Oooo0oo;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public TwitterLoginButton(Context context) {
        this(context, null);
    }

    public Activity getActivity() {
        if ((getContext() instanceof ContextThemeWrapper) && (((ContextThemeWrapper) getContext()).getBaseContext() instanceof Activity)) {
            return (Activity) ((ContextThemeWrapper) getContext()).getBaseContext();
        }
        if (getContext() instanceof Activity) {
            return (Activity) getContext();
        }
        if (isInEditMode()) {
            return null;
        }
        throw new IllegalStateException("TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
    }

    public o0O0o<o0O0O0Oo> getCallback() {
        return this.f19955Oooo;
    }

    public o00O0O getTwitterAuthClient() {
        if (this.f19957Oooo0oO == null) {
            synchronized (TwitterLoginButton.class) {
                if (this.f19957Oooo0oO == null) {
                    this.f19957Oooo0oO = new o00O0O();
                }
            }
        }
        return this.f19957Oooo0oO;
    }

    public void setCallback(o0O0o<o0O0O0Oo> o0o0o) {
        if (o0o0o == null) {
            throw new IllegalArgumentException("Callback cannot be null");
        }
        this.f19955Oooo = o0o0o;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f19958Oooo0oo = onClickListener;
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19956Oooo0o = new WeakReference<>(getActivity());
        this.f19957Oooo0oO = null;
        Resources resources = getResources();
        super.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(o0O000o0.tw__ic_logo_default), (Drawable) null, (Drawable) null, (Drawable) null);
        super.setCompoundDrawablePadding(resources.getDimensionPixelSize(o0O000Oo.tw__login_btn_drawable_padding));
        super.setText(o0O00O0o.tw__login_btn_txt);
        super.setTextColor(resources.getColor(o0OoOoOo.tw__solid_white));
        super.setTextSize(0, resources.getDimensionPixelSize(o0O000Oo.tw__login_btn_text_size));
        super.setTypeface(Typeface.DEFAULT_BOLD);
        super.setPadding(resources.getDimensionPixelSize(o0O000Oo.tw__login_btn_left_padding), 0, resources.getDimensionPixelSize(o0O000Oo.tw__login_btn_right_padding), 0);
        super.setBackgroundResource(o0O000o0.tw__login_btn);
        super.setOnClickListener(new OooO00o());
        super.setAllCaps(false);
        if (isInEditMode()) {
            return;
        }
        try {
            o0O0oo0o.OooO0OO();
        } catch (IllegalStateException e) {
            o0oO0Ooo.OooO0OO().OooO00o("Twitter", e.getMessage());
            setEnabled(false);
        }
    }
}
