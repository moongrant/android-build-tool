package p439o0OoOOo0;

import android.view.View;
import com.twitter.sdk.android.core.TwitterApiException;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.tweetui.ToggleImageButton;
import java.util.Objects;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O0o;
import p436o0OoOOOO.o0O000;
import p436o0OoOOOO.o0O00OOO;
import p436o0OoOOOO.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 extends o00000O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0O00OOO f40111Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00O0O00 f40112Oooo0oo;

    public static class OooO00o extends o0O0o<o0O00OOO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ToggleImageButton f40113OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O00OOO f40114OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0O0o<o0O00OOO> f40115OooO0OO;

        public OooO00o(ToggleImageButton toggleImageButton, o0O00OOO o0o00ooo2, o0O0o<o0O00OOO> o0o0o) {
            this.f40113OooO00o = toggleImageButton;
            this.f40114OooO0O0 = o0o00ooo2;
            this.f40115OooO0OO = o0o0o;
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0OO(TwitterException twitterException) {
            if (!(twitterException instanceof TwitterApiException)) {
                this.f40113OooO00o.setToggledOn(this.f40114OooO0O0.f40009OooO0oO);
                this.f40115OooO0OO.OooO0OO(twitterException);
                return;
            }
            o0O000 o0o001 = ((TwitterApiException) twitterException).f19937Oooo0o;
            int i = o0o001 == null ? 0 : o0o001.f39977OooO0O0;
            if (i == 139) {
                o0oO0Ooo o0oo0ooo2 = new o0oO0Ooo();
                o0oo0ooo2.OooO0O0(this.f40114OooO0O0);
                o0oo0ooo2.f40057OooO0oO = true;
                this.f40115OooO0OO.OooO0Oo(new o0O00O<>(o0oo0ooo2.OooO00o(), null));
                return;
            }
            if (i != 144) {
                this.f40113OooO00o.setToggledOn(this.f40114OooO0O0.f40009OooO0oO);
                this.f40115OooO0OO.OooO0OO(twitterException);
            } else {
                o0oO0Ooo o0oo0ooo3 = new o0oO0Ooo();
                o0oo0ooo3.OooO0O0(this.f40114OooO0O0);
                o0oo0ooo3.f40057OooO0oO = false;
                this.f40115OooO0OO.OooO0Oo(new o0O00O<>(o0oo0ooo3.OooO00o(), null));
            }
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0Oo(o0O00O<o0O00OOO> o0o00o2) {
            this.f40115OooO0OO.OooO0Oo(o0o00o2);
        }
    }

    public o000(o0O00OOO o0o00ooo2, o00O0OO0 o00o0oo1, o0O0o<o0O00OOO> o0o0o) {
        super(o0o0o);
        this.f40111Oooo0oO = o0o00ooo2;
        this.f40112Oooo0oo = o00o0oo1.f40174OooO00o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view instanceof ToggleImageButton) {
            ToggleImageButton toggleImageButton = (ToggleImageButton) view;
            o0O00OOO o0o00ooo2 = this.f40111Oooo0oO;
            if (o0o00ooo2.f40009OooO0oO) {
                o00O0O00 o00o0o01 = this.f40112Oooo0oo;
                long j = o0o00ooo2.f40002OooO;
                OooO00o oooO00o = new OooO00o(toggleImageButton, o0o00ooo2, this.f40118Oooo0o);
                Objects.requireNonNull(o00o0o01);
                o00o0o01.OooO0O0(new o00O0(o00o0o01, oooO00o, p433o0OoOO0o.o0oO0Ooo.OooO0OO(), j, oooO00o));
                return;
            }
            o00O0O00 o00o0o02 = this.f40112Oooo0oo;
            long j2 = o0o00ooo2.f40002OooO;
            OooO00o oooO00o2 = new OooO00o(toggleImageButton, o0o00ooo2, this.f40118Oooo0o);
            Objects.requireNonNull(o00o0o02);
            o00o0o02.OooO0O0(new oo00o(o00o0o02, oooO00o2, p433o0OoOO0o.o0oO0Ooo.OooO0OO(), j2, oooO00o2));
        }
    }
}
