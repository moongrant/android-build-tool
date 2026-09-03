package com.twitter.sdk.android.tweetui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.billingclient.api.o0000;
import com.android.billingclient.api.o0OoOo0;
import com.facebook.internal.AnalyticsEvents;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetui.internal.AspectRatioFrameLayout;
import com.twitter.sdk.android.tweetui.internal.MediaBadgeView;
import com.twitter.sdk.android.tweetui.internal.TweetMediaView;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import p418o0Oo0oo.oo000o;
import p433o0OoOO0o.o0oO0Ooo;
import p436o0OoOOOO.o0O000Oo;
import p436o0OoOOOO.o0O00O0o;
import p436o0OoOOOO.o0O00OOO;
import p436o0OoOOOO.o0O00o00;
import p438o0OoOOo.o000;
import p438o0OoOOo.o000O0o;
import p439o0OoOOo0.o00;
import p439o0OoOOo0.o00000O0;
import p439o0OoOOo0.o0000O0;
import p439o0OoOOo0.o0000O0O;
import p439o0OoOOo0.o0000oo;
import p439o0OoOOo0.o000O000;
import p439o0OoOOo0.o00O00O;
import p439o0OoOOo0.o00O00OO;
import p439o0OoOOo0.o00O0O0;
import p439o0OoOOo0.o00O0O0O;
import p439o0OoOOo0.o00O0OO0;
import p439o0OoOOo0.o00oOoo;
import p439o0OoOOo0.oOO00O;
import p440o0OoOOoO.o0OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o extends RelativeLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o00O00OO f20101Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C0182OooO00o f20102Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00000O0 f20103Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oOO00O f20104Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f20105OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public o0O00OOO f20106OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Uri f20107OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f20108OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f20109OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TweetMediaView f20110OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public TextView f20111OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public MediaBadgeView f20112OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f20113OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f20114OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f20115Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f20116Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f20117OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f20118OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public AspectRatioFrameLayout f20119o000oOoO;

    /* JADX INFO: renamed from: com.twitter.sdk.android.tweetui.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0182OooO00o {
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (OooO00o.this.getPermalinkUri() == null) {
                return;
            }
            OooO00o oooO00o = OooO00o.this;
            Objects.requireNonNull(oooO00o);
            if (oo000o.OooO0OO(oooO00o.getContext(), new Intent("android.intent.action.VIEW", oooO00o.getPermalinkUri()))) {
                return;
            }
            o0oO0Ooo.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to open permalink URI");
        }
    }

    public OooO00o(Context context, AttributeSet attributeSet, int i, C0182OooO00o c0182OooO00o) {
        super(context, attributeSet, i);
        this.f20102Oooo0o = c0182OooO00o;
        LayoutInflater.from(context).inflate(getLayout(), (ViewGroup) this, true);
        OooO00o();
    }

    private void setName(o0O00OOO o0o00ooo2) {
        User user;
        if (o0o00ooo2 == null || (user = o0o00ooo2.f40031OooOooO) == null) {
            this.f20105OoooO.setText("");
            return;
        }
        TextView textView = this.f20105OoooO;
        String str = user.f20030OooooOO;
        textView.setText(str != null ? str : "");
    }

    private void setScreenName(o0O00OOO o0o00ooo2) {
        User user;
        String str = "";
        if (o0o00ooo2 == null || (user = o0o00ooo2.f40031OooOooO) == null) {
            this.f20109OoooOO0.setText("");
            return;
        }
        TextView textView = this.f20109OoooOO0;
        String str2 = user.f20042o00oO0o;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.charAt(0) == '@') {
                str = str2;
            } else {
                str = "@" + ((Object) str2);
            }
        }
        textView.setText(str);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    @TargetApi(16)
    private void setText(o0O00OOO o0o00ooo2) {
        o0000O0O o0000o0o2;
        CharSequence charSequenceSubSequence;
        this.f20111OoooOOo.setImportantForAccessibility(2);
        Objects.requireNonNull(this.f20102Oooo0o);
        o0000O0 o0000o0OooO00o = o00O0OO0.OooO00o().f40174OooO00o.OooO00o(o0o00ooo2);
        if (o0000o0OooO00o == null) {
            charSequenceSubSequence = null;
        } else {
            o0O000Oo o0o000oo2 = o0o00ooo2.f40035Oooo00o;
            boolean z = o0o000oo2 != null && o0OO0O0.OooO0Oo(o0o000oo2);
            boolean zOooO0OO = o0OoOo0.OooO0OO(o0o00ooo2);
            o000O000 linkClickListener = getLinkClickListener();
            int i = this.f20115Ooooo00;
            int i2 = this.f20116Ooooo0o;
            Pattern pattern = o00O0O0O.f40171OooO00o;
            if (TextUtils.isEmpty(o0000o0OooO00o.f40124OooO00o)) {
                charSequenceSubSequence = o0000o0OooO00o.f40124OooO00o;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o0000o0OooO00o.f40124OooO00o);
                List listOooO0OO = o0000.OooO0OO(o0000o0OooO00o.f40125OooO0O0);
                List listOooO0OO2 = o0000.OooO0OO(o0000o0OooO00o.f40126OooO0OO);
                List listOooO0OO3 = o0000.OooO0OO(o0000o0OooO00o.f40127OooO0Oo);
                List listOooO0OO4 = o0000.OooO0OO(o0000o0OooO00o.f40129OooO0o0);
                List listOooO0OO5 = o0000.OooO0OO(o0000o0OooO00o.f40128OooO0o);
                ArrayList<o0000O0O> arrayList = new ArrayList(listOooO0OO);
                arrayList.addAll(listOooO0OO2);
                arrayList.addAll(listOooO0OO3);
                arrayList.addAll(listOooO0OO4);
                arrayList.addAll(listOooO0OO5);
                Collections.sort(arrayList, p319o0O0oOo0.o0000O0O.f36761Oooo0oo);
                String strSubstring = o0000o0OooO00o.f40124OooO00o;
                if (arrayList.isEmpty()) {
                    o0000o0o2 = null;
                } else {
                    o0000o0o2 = (o0000O0O) arrayList.get(arrayList.size() - 1);
                    if (strSubstring.endsWith(Character.toString((char) 8206))) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                    if (!strSubstring.endsWith(o0000o0o2.f40133OooO0Oo)) {
                        o0000o0o2 = null;
                    } else if (!((o0000o0o2 instanceof o0000oo) && AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(((o0000oo) o0000o0o2).f40139OooO0o)) && ((!zOooO0OO || !o00O0O0O.f40171OooO00o.matcher(o0000o0o2.f40134OooO0o0).find()) && (!z || !o00O0O0O.f40172OooO0O0.matcher(o0000o0o2.f40134OooO0o0).find()))) {
                        o0000o0o2 = null;
                    }
                }
                if (!arrayList.isEmpty()) {
                    int i3 = 0;
                    for (o0000O0O o0000o0o3 : arrayList) {
                        int i4 = o0000o0o3.f40130OooO00o - i3;
                        int i5 = o0000o0o3.f40131OooO0O0 - i3;
                        if (i4 >= 0 && i5 <= spannableStringBuilder.length()) {
                            if (o0000o0o2 != null && o0000o0o2.f40130OooO00o == o0000o0o3.f40130OooO00o) {
                                spannableStringBuilder.replace(i4, i5, (CharSequence) "");
                                i3 += i5 - i4;
                            } else if (!TextUtils.isEmpty(o0000o0o3.f40132OooO0OO)) {
                                spannableStringBuilder.replace(i4, i5, (CharSequence) o0000o0o3.f40132OooO0OO);
                                int length = i5 - (o0000o0o3.f40132OooO0OO.length() + i4);
                                i3 += length;
                                spannableStringBuilder.setSpan(new o00O0O0(i2, i, linkClickListener, o0000o0o3), i4, i5 - length, 33);
                            }
                        }
                    }
                }
                int length2 = spannableStringBuilder.length();
                while (length2 > 0) {
                    int i6 = length2 - 1;
                    if (spannableStringBuilder.charAt(i6) > ' ') {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
                charSequenceSubSequence = length2 < spannableStringBuilder.length() ? spannableStringBuilder.subSequence(0, length2) : spannableStringBuilder;
            }
        }
        if (charSequenceSubSequence == null) {
            charSequenceSubSequence = "";
        }
        TextView textView = this.f20111OoooOOo;
        final o000 o000Var = new o000(textView);
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: o0OoOOo.o0000OO0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o000OO o000oo2;
                o000 o000Var2 = o000Var;
                TextView textView2 = (TextView) view;
                Layout layout = textView2.getLayout();
                if (layout == null) {
                    return false;
                }
                o000Var2.f40094OooO0O0 = layout;
                o000Var2.f40095OooO0OO = textView2.getScrollX() + textView2.getTotalPaddingLeft();
                o000Var2.f40096OooO0Oo = textView2.getScrollY() + textView2.getTotalPaddingTop();
                CharSequence text = o000Var2.f40094OooO0O0.getText();
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                if (spanned == null) {
                    return false;
                }
                int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
                int x = (int) (motionEvent.getX() - o000Var2.f40095OooO0OO);
                int y = (int) (motionEvent.getY() - o000Var2.f40096OooO0Oo);
                if (x < 0 || x >= o000Var2.f40094OooO0O0.getWidth() || y < 0 || y >= o000Var2.f40094OooO0O0.getHeight()) {
                    o000Var2.OooO00o();
                    return false;
                }
                int lineForVertical = o000Var2.f40094OooO0O0.getLineForVertical(y);
                float f = x;
                if (f < o000Var2.f40094OooO0O0.getLineLeft(lineForVertical) || f > o000Var2.f40094OooO0O0.getLineRight(lineForVertical)) {
                    o000Var2.OooO00o();
                    return false;
                }
                if (action == 0) {
                    int offsetForHorizontal = o000Var2.f40094OooO0O0.getOffsetForHorizontal(lineForVertical, f);
                    o000OO[] o000ooArr = (o000OO[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, o000OO.class);
                    if (o000ooArr.length <= 0) {
                        return false;
                    }
                    o000OO o000oo3 = o000ooArr[0];
                    o000oo3.OooO00o(true);
                    o000Var2.f40097OooO0o0 = o000oo3;
                    o000Var2.OooO0O0();
                } else {
                    if (action != 1 || (o000oo2 = o000Var2.f40097OooO0o0) == null) {
                        return false;
                    }
                    o000oo2.onClick(o000Var2.f40093OooO00o);
                    o000Var2.OooO00o();
                }
                return true;
            }
        });
        if (TextUtils.isEmpty(charSequenceSubSequence)) {
            this.f20111OoooOOo.setText("");
            this.f20111OoooOOo.setVisibility(8);
        } else {
            this.f20111OoooOOo.setText(charSequenceSubSequence);
            this.f20111OoooOOo.setVisibility(0);
        }
    }

    public void OooO00o() {
        this.f20105OoooO = (TextView) findViewById(o00.tw__tweet_author_full_name);
        this.f20109OoooOO0 = (TextView) findViewById(o00.tw__tweet_author_screen_name);
        this.f20119o000oOoO = (AspectRatioFrameLayout) findViewById(o00.tw__aspect_ratio_media_container);
        this.f20110OoooOOO = (TweetMediaView) findViewById(o00.tweet_media_view);
        this.f20111OoooOOo = (TextView) findViewById(o00.tw__tweet_text);
        this.f20112OoooOo0 = (MediaBadgeView) findViewById(o00.tw__tweet_media_badge);
    }

    public double OooO0O0(MediaEntity mediaEntity) {
        MediaEntity.Sizes sizes;
        MediaEntity.Size size;
        int i;
        int i2;
        if (mediaEntity == null || (sizes = mediaEntity.f19992OoooOO0) == null || (size = sizes.f20002Oooo0o) == null || (i = size.f19998Oooo0o) == 0 || (i2 = size.f19999Oooo0oO) == 0) {
            return 1.7777777777777777d;
        }
        return ((double) i) / ((double) i2);
    }

    public abstract double OooO0OO(int i);

    public void OooO0Oo() {
        o0O00OOO o0o00ooo2;
        o0O00OOO o0o00ooo3 = this.f20106OoooO0;
        if (o0o00ooo3 != null && (o0o00ooo2 = o0o00ooo3.f40027OooOoO0) != null) {
            o0o00ooo3 = o0o00ooo2;
        }
        setName(o0o00ooo3);
        setScreenName(o0o00ooo3);
        setTweetMedia(o0o00ooo3);
        setText(o0o00ooo3);
        setContentDescription(o0o00ooo3);
        if (o0OoOo0.OooO0O0(this.f20106OoooO0)) {
            OooO0o0(this.f20106OoooO0.f40031OooOooO.f20042o00oO0o, Long.valueOf(getTweetId()));
        } else {
            this.f20107OoooO00 = null;
        }
        setOnClickListener(new OooO0O0());
    }

    public final void OooO0o0(String str, Long l) {
        Uri uri;
        if (l.longValue() <= 0) {
            return;
        }
        long jLongValue = l.longValue();
        if (jLongValue <= 0) {
            uri = null;
        } else {
            uri = Uri.parse(TextUtils.isEmpty(str) ? String.format(Locale.US, "https://twitter.com/%s/status/%d?ref_src=twsrc%%5Etwitterkit", "twitter_unknown", Long.valueOf(jLongValue)) : String.format(Locale.US, "https://twitter.com/%s/status/%d?ref_src=twsrc%%5Etwitterkit", str, Long.valueOf(jLongValue)));
        }
        this.f20107OoooO00 = uri;
    }

    public abstract int getLayout();

    public o000O000 getLinkClickListener() {
        if (this.f20103Oooo0oO == null) {
            this.f20103Oooo0oO = new o00000O0(this, 0);
        }
        return this.f20103Oooo0oO;
    }

    public Uri getPermalinkUri() {
        return this.f20107OoooO00;
    }

    public o0O00OOO getTweet() {
        return this.f20106OoooO0;
    }

    public long getTweetId() {
        o0O00OOO o0o00ooo2 = this.f20106OoooO0;
        if (o0o00ooo2 == null) {
            return -1L;
        }
        return o0o00ooo2.f40002OooO;
    }

    public void setContentDescription(o0O00OOO o0o00ooo2) {
        if (!o0OoOo0.OooO0O0(o0o00ooo2)) {
            setContentDescription(getResources().getString(o00oOoo.tw__loading_tweet));
            return;
        }
        Objects.requireNonNull(this.f20102Oooo0o);
        o0000O0 o0000o0OooO00o = o00O0OO0.OooO00o().f40174OooO00o.OooO00o(o0o00ooo2);
        String str = o0000o0OooO00o != null ? o0000o0OooO00o.f40124OooO00o : null;
        long jOooO00o = o00O00O.OooO00o(o0o00ooo2.f40004OooO0O0);
        String str2 = jOooO00o != -1 ? DateFormat.getDateInstance().format(new Date(jOooO00o)) : null;
        Resources resources = getResources();
        int i = o00oOoo.tw__tweet_content_description;
        Object[] objArr = new Object[3];
        String str3 = o0o00ooo2.f40031OooOooO.f20030OooooOO;
        if (str3 == null) {
            str3 = "";
        }
        objArr[0] = str3;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[2] = str2;
        setContentDescription(resources.getString(i, objArr));
    }

    public void setTweet(o0O00OOO o0o00ooo2) {
        this.f20106OoooO0 = o0o00ooo2;
        OooO0Oo();
    }

    public void setTweetLinkClickListener(oOO00O ooo00o) {
        this.f20104Oooo0oo = ooo00o;
    }

    public final void setTweetMedia(o0O00OOO o0o00ooo2) {
        MediaEntity mediaEntity;
        List<MediaEntity> list;
        int i;
        this.f20119o000oOoO.setVisibility(8);
        if (o0o00ooo2 == null) {
            return;
        }
        o0O000Oo o0o000oo2 = o0o00ooo2.f40035Oooo00o;
        if (o0o000oo2 != null && o0OO0O0.OooO0Oo(o0o000oo2)) {
            o0O000Oo o0o000oo3 = o0o00ooo2.f40035Oooo00o;
            o0O00O0o o0o00o0o = (o0O00O0o) o0o000oo3.f39979OooO00o.OooO00o("player_image");
            String str = (String) o0o000oo3.f39979OooO00o.OooO00o("player_stream_url");
            if (o0o00o0o == null || TextUtils.isEmpty(str)) {
                return;
            }
            int i2 = o0o00o0o.f39988OooO0O0;
            setViewsForMedia((i2 == 0 || (i = o0o00o0o.f39987OooO00o) == 0) ? 1.7777777777777777d : ((double) i2) / ((double) i));
            this.f20110OoooOOO.setVineCard(o0o00ooo2);
            this.f20112OoooOo0.setVisibility(0);
            this.f20112OoooOo0.setCard(o0o000oo3);
            return;
        }
        MediaEntity mediaEntityOooO0OO = o000O0o.OooO0OO(o0o00ooo2);
        if ((mediaEntityOooO0OO == null || o000O0o.OooO0O0(mediaEntityOooO0OO) == null) ? false : true) {
            MediaEntity mediaEntityOooO0OO2 = o000O0o.OooO0OO(o0o00ooo2);
            setViewsForMedia(OooO0O0(mediaEntityOooO0OO2));
            this.f20110OoooOOO.OooO(this.f20106OoooO0, Collections.singletonList(mediaEntityOooO0OO2));
            this.f20112OoooOo0.setVisibility(0);
            this.f20112OoooOo0.setMediaEntity(mediaEntityOooO0OO2);
            return;
        }
        ArrayList arrayList = (ArrayList) o000O0o.OooO00o(o0o00ooo2);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                mediaEntity = null;
                break;
            }
            mediaEntity = (MediaEntity) arrayList.get(size);
            String str2 = mediaEntity.f19994OoooOOo;
            if (str2 != null && AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(str2)) {
                break;
            }
        }
        if (mediaEntity != null) {
            ArrayList arrayList2 = new ArrayList();
            o0O00o00 o0o00o01 = o0o00ooo2.f40008OooO0o0;
            if (o0o00o01 != null && (list = o0o00o01.f40039OooO0OO) != null && list.size() > 0) {
                for (int i3 = 0; i3 <= o0o00o01.f40039OooO0OO.size() - 1; i3++) {
                    MediaEntity mediaEntity2 = o0o00o01.f40039OooO0OO.get(i3);
                    String str3 = mediaEntity2.f19994OoooOOo;
                    if (str3 != null && AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(str3)) {
                        arrayList2.add(mediaEntity2);
                    }
                }
            }
            setViewsForMedia(OooO0OO(arrayList2.size()));
            this.f20110OoooOOO.OooO(o0o00ooo2, arrayList2);
            this.f20112OoooOo0.setVisibility(8);
        }
    }

    public void setTweetMediaClickListener(o00O00OO o00o00oo2) {
        this.f20101Oooo = o00o00oo2;
        this.f20110OoooOOO.setTweetMediaClickListener(o00o00oo2);
    }

    public void setViewsForMedia(double d) {
        this.f20119o000oOoO.setVisibility(0);
        this.f20119o000oOoO.setAspectRatio(d);
        this.f20110OoooOOO.setVisibility(0);
    }
}
