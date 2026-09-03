package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p234o00oOoo0.o000O0O0;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14000OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<Cue> f14001OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14002OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CaptionStyleCompat f14003OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f14004OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f14005OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f14006OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f14007OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO00o f14008OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public View f14009OooOOO0;

    public interface OooO00o {
        void OooO00o(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.f14000OooO && this.f14006OooOO0) {
            return this.f14001OooO0Oo;
        }
        ArrayList arrayList = new ArrayList(this.f14001OooO0Oo.size());
        for (int i = 0; i < this.f14001OooO0Oo.size(); i++) {
            Cue cue = this.f14001OooO0Oo.get(i);
            cue.getClass();
            Cue.OooO00o oooO00o = new Cue.OooO00o(cue);
            if (!this.f14000OooO) {
                oooO00o.f13430OooOOO = false;
                CharSequence charSequence = oooO00o.f13419OooO00o;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        oooO00o.f13419OooO00o = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = oooO00o.f13419OooO00o;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof o000O0O0)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                o0000oo.OooO00o(oooO00o);
            } else if (!this.f14006OooOO0) {
                o0000oo.OooO00o(oooO00o);
            }
            arrayList.add(oooO00o.OooO00o());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (o0O00.f40595OooO00o < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        CaptioningManager captioningManager;
        CaptionStyleCompat captionStyleCompat;
        int i = o0O00.f40595OooO00o;
        CaptionStyleCompat captionStyleCompat2 = CaptionStyleCompat.f13748OooO0oO;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return captionStyleCompat2;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            captionStyleCompat = new CaptionStyleCompat(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        } else {
            captionStyleCompat = new CaptionStyleCompat(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return captionStyleCompat;
    }

    private <T extends View & OooO00o> void setView(T t) {
        removeView(this.f14009OooOOO0);
        View view = this.f14009OooOOO0;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f14028OooO0o0.destroy();
        }
        this.f14009OooOOO0 = t;
        this.f14008OooOO0o = t;
        addView(t);
    }

    public final void OooO00o() {
        setStyle(getUserCaptionStyle());
    }

    public final void OooO0O0() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void OooO0OO() {
        this.f14008OooOO0o.OooO00o(getCuesWithStylingPreferencesApplied(), this.f14003OooO0o0, this.f14004OooO0oO, this.f14002OooO0o, this.f14005OooO0oo);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f14006OooOO0 = z;
        OooO0OO();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f14000OooO = z;
        OooO0OO();
    }

    public void setBottomPaddingFraction(float f) {
        this.f14005OooO0oo = f;
        OooO0OO();
    }

    public void setCues(@Nullable List<Cue> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f14001OooO0Oo = list;
        OooO0OO();
    }

    public void setFractionalTextSize(float f) {
        this.f14002OooO0o = 0;
        this.f14004OooO0oO = f;
        OooO0OO();
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.f14003OooO0o0 = captionStyleCompat;
        OooO0OO();
    }

    public void setViewType(int i) {
        if (this.f14007OooOO0O == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext(), null));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext(), null));
        }
        this.f14007OooOO0O = i;
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14001OooO0Oo = Collections.emptyList();
        this.f14003OooO0o0 = CaptionStyleCompat.f13748OooO0oO;
        this.f14002OooO0o = 0;
        this.f14004OooO0oO = 0.0533f;
        this.f14005OooO0oo = 0.08f;
        this.f14000OooO = true;
        this.f14006OooOO0 = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, null);
        this.f14008OooOO0o = canvasSubtitleOutput;
        this.f14009OooOOO0 = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f14007OooOO0O = 1;
    }
}
