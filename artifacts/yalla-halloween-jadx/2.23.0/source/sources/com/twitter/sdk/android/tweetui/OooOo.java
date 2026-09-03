package com.twitter.sdk.android.tweetui;

import android.view.View;
import com.twitter.sdk.android.core.TwitterApiException;
import com.twitter.sdk.android.core.TwitterException;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000oo f22315OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.twitter.sdk.android.core.models.OooOo f22316OooO0o0;

    public static class OooO00o extends com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ToggleImageButton f22317OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.twitter.sdk.android.core.models.OooOo f22318OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> f22319OooO0OO;

        public OooO00o(ToggleImageButton toggleImageButton, com.twitter.sdk.android.core.models.OooOo oooOo, com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0) {
            this.f22317OooO00o = toggleImageButton;
            this.f22318OooO0O0 = oooOo;
            this.f22319OooO0OO = oooO0O0;
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            boolean z = twitterException instanceof TwitterApiException;
            ToggleImageButton toggleImageButton = this.f22317OooO00o;
            com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0 = this.f22319OooO0OO;
            com.twitter.sdk.android.core.models.OooOo oooOo = this.f22318OooO0O0;
            if (!z) {
                toggleImageButton.setToggledOn(oooOo.f22071OooO0oO);
                oooO0O0.OooO0OO(twitterException);
                return;
            }
            com.twitter.sdk.android.core.models.OooO00o oooO00o = ((TwitterApiException) twitterException).f21975OooO0Oo;
            int i = oooO00o == null ? 0 : oooO00o.f22047OooO0O0;
            if (i == 139) {
                com.twitter.sdk.android.core.models.Oooo000 oooo000 = new com.twitter.sdk.android.core.models.Oooo000();
                oooo000.OooO0O0(oooOo);
                oooo000.f22122OooO0oO = true;
                oooO0O0.OooO0Oo(new com.twitter.sdk.android.core.o000oOoO<>(oooo000.OooO00o(), null));
                return;
            }
            if (i != 144) {
                toggleImageButton.setToggledOn(oooOo.f22071OooO0oO);
                oooO0O0.OooO0OO(twitterException);
            } else {
                com.twitter.sdk.android.core.models.Oooo000 oooo001 = new com.twitter.sdk.android.core.models.Oooo000();
                oooo001.OooO0O0(oooOo);
                oooo001.f22122OooO0oO = false;
                oooO0O0.OooO0Oo(new com.twitter.sdk.android.core.o000oOoO<>(oooo001.OooO00o(), null));
            }
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(com.twitter.sdk.android.core.o000oOoO<com.twitter.sdk.android.core.models.OooOo> o000oooo2) {
            this.f22319OooO0OO.OooO0Oo(o000oooo2);
        }
    }

    public OooOo(com.twitter.sdk.android.core.models.OooOo oooOo, o0000O o0000o2, com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0) {
        super(oooO0O0);
        this.f22316OooO0o0 = oooOo;
        this.f22315OooO0o = o0000o2.f22442OooO00o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view instanceof ToggleImageButton) {
            ToggleImageButton toggleImageButton = (ToggleImageButton) view;
            com.twitter.sdk.android.core.models.OooOo oooOo = this.f22316OooO0o0;
            boolean z = oooOo.f22071OooO0oO;
            com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0 = this.f22296OooO0Oo;
            o0000oo o0000ooVar = this.f22315OooO0o;
            if (z) {
                long j = oooOo.f22064OooO;
                OooO00o oooO00o = new OooO00o(toggleImageButton, oooOo, oooO0O0);
                o0000ooVar.getClass();
                o0000ooVar.OooO0O0(new o0000O00(o0000ooVar, oooO00o, com.twitter.sdk.android.core.o00Oo0.OooO0OO(), j, oooO00o));
                return;
            }
            long j2 = oooOo.f22064OooO;
            OooO00o oooO00o2 = new OooO00o(toggleImageButton, oooOo, oooO0O0);
            o0000ooVar.getClass();
            o0000ooVar.OooO0O0(new o0000(o0000ooVar, oooO00o2, com.twitter.sdk.android.core.o00Oo0.OooO0OO(), j2, oooO00o2));
        }
    }
}
