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
import com.facebook.internal.AnalyticsEvents;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetui.internal.AspectRatioFrameLayout;
import com.twitter.sdk.android.tweetui.internal.MediaBadgeView;
import com.twitter.sdk.android.tweetui.internal.TweetMediaView;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO00o extends RelativeLayout {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f22277OooOo0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f22278OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C0282OooO00o f22279OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Uri f22280OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public p671oo0oOOo.OooOo00 f22281OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public com.twitter.sdk.android.core.models.OooOo f22282OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f22283OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f22284OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public AspectRatioFrameLayout f22285OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TweetMediaView f22286OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public MediaBadgeView f22287OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f22288OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f22289OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f22290OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f22291OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f22292OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f22293OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f22294OooOo00;

    /* JADX INFO: renamed from: com.twitter.sdk.android.tweetui.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0282OooO00o {
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.getPermalinkUri() == null) {
                return;
            }
            oooO00o.getClass();
            if (com.twitter.sdk.android.core.OooOO0.OooO00o(oooO00o.getContext(), new Intent("android.intent.action.VIEW", oooO00o.getPermalinkUri()))) {
                return;
            }
            com.twitter.sdk.android.core.o00Oo0.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to open permalink URI");
        }
    }

    public OooO00o(Context context, AttributeSet attributeSet, int i, C0282OooO00o c0282OooO00o) {
        super(context, attributeSet, i);
        this.f22279OooO0Oo = c0282OooO00o;
        LayoutInflater.from(context).inflate(getLayout(), (ViewGroup) this, true);
        OooO00o();
    }

    private void setName(com.twitter.sdk.android.core.models.OooOo oooOo) {
        User user;
        if (oooOo == null || (user = oooOo.f22093OooOooO) == null) {
            this.f22278OooO.setText("");
            return;
        }
        TextView textView = this.f22278OooO;
        String str = user.f22172OooOo0O;
        textView.setText(str != null ? str : "");
    }

    private void setScreenName(com.twitter.sdk.android.core.models.OooOo oooOo) {
        User user;
        String str = "";
        if (oooOo == null || (user = oooOo.f22093OooOooO) == null) {
            this.f22284OooOO0.setText("");
            return;
        }
        TextView textView = this.f22284OooOO0;
        String str2 = user.f22186Oooo0O0;
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

    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    @TargetApi(16)
    private void setText(com.twitter.sdk.android.core.models.OooOo oooOo) {
        OooOOO0 oooOOO0;
        CharSequence charSequenceSubSequence;
        com.twitter.sdk.android.core.models.Oooo0 oooo0;
        List<MediaEntity> list;
        this.f22288OooOOO0.setImportantForAccessibility(2);
        this.f22279OooO0Oo.getClass();
        OooOO0O oooOO0OOooO00o = o0000O.OooO00o().f22442OooO00o.OooO00o(oooOo);
        if (oooOO0OOooO00o == null) {
            charSequenceSubSequence = null;
        } else {
            com.twitter.sdk.android.core.models.OooO0o oooO0o = oooOo.f22097Oooo00o;
            boolean z = oooO0o != null && o0OOOOO.Oooo000.OooO00o(oooO0o);
            boolean z2 = oooOo.f22086OooOo0O != null && oooOo.f22097Oooo00o == null && ((oooo0 = oooOo.f22068OooO0Oo) == null || (list = oooo0.f22112OooO0OO) == null || list.isEmpty());
            Oooo000 linkClickListener = getLinkClickListener();
            int i = this.f22292OooOOo0;
            int i2 = this.f22291OooOOo;
            Pattern pattern = o0000O0O.f22449OooO00o;
            if (TextUtils.isEmpty(oooOO0OOooO00o.f22302OooO00o)) {
                charSequenceSubSequence = oooOO0OOooO00o.f22302OooO00o;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oooOO0OOooO00o.f22302OooO00o);
                List listOooO00o = com.twitter.sdk.android.core.models.OooOOOO.OooO00o(oooOO0OOooO00o.f22303OooO0O0);
                List listOooO00o2 = com.twitter.sdk.android.core.models.OooOOOO.OooO00o(oooOO0OOooO00o.f22304OooO0OO);
                List listOooO00o3 = com.twitter.sdk.android.core.models.OooOOOO.OooO00o(oooOO0OOooO00o.f22305OooO0Oo);
                List listOooO00o4 = com.twitter.sdk.android.core.models.OooOOOO.OooO00o(oooOO0OOooO00o.f22307OooO0o0);
                List listOooO00o5 = com.twitter.sdk.android.core.models.OooOOOO.OooO00o(oooOO0OOooO00o.f22306OooO0o);
                ArrayList<OooOOO0> arrayList = new ArrayList(listOooO00o);
                arrayList.addAll(listOooO00o2);
                arrayList.addAll(listOooO00o3);
                arrayList.addAll(listOooO00o4);
                arrayList.addAll(listOooO00o5);
                Collections.sort(arrayList, new p277o0O00o0.OooO0OO(1));
                String strSubstring = oooOO0OOooO00o.f22302OooO00o;
                if (arrayList.isEmpty()) {
                    oooOOO0 = null;
                } else {
                    oooOOO0 = (OooOOO0) p018OooOoo0.OooOOO.OooO0O0(arrayList, 1);
                    if (strSubstring.endsWith(Character.toString((char) 8206))) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                    if (!strSubstring.endsWith(oooOOO0.f22312OooO0Oo)) {
                        oooOOO0 = null;
                    } else if (!((oooOOO0 instanceof OooOO0) && AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(((OooOO0) oooOOO0).f22301OooO0o))) {
                        String str = oooOOO0.f22313OooO0o0;
                        if ((!z2 || !o0000O0O.f22449OooO00o.matcher(str).find()) && (!z || !o0000O0O.f22450OooO0O0.matcher(str).find())) {
                            oooOOO0 = null;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    int i3 = 0;
                    for (OooOOO0 oooOOO1 : arrayList) {
                        int i4 = oooOOO1.f22309OooO00o - i3;
                        int i5 = oooOOO1.f22310OooO0O0 - i3;
                        if (i4 >= 0 && i5 <= spannableStringBuilder.length()) {
                            if (oooOOO0 == null || oooOOO0.f22309OooO00o != oooOOO1.f22309OooO00o) {
                                String str2 = oooOOO1.f22311OooO0OO;
                                if (!TextUtils.isEmpty(str2)) {
                                    spannableStringBuilder.replace(i4, i5, (CharSequence) str2);
                                    int length = i5 - (str2.length() + i4);
                                    i3 += length;
                                    spannableStringBuilder.setSpan(new o0000O0(i2, i, linkClickListener, oooOOO1), i4, i5 - length, 33);
                                }
                            } else {
                                spannableStringBuilder.replace(i4, i5, (CharSequence) "");
                                i3 += i5 - i4;
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
        TextView textView = this.f22288OooOOO0;
        final p347o0OOOOoo.o00Ooo o00ooo2 = new p347o0OOOOoo.o00Ooo(textView);
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: o0OOOOoo.o00Oo0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o000oOoO o000oooo2;
                TextView textView2 = (TextView) view;
                Layout layout = textView2.getLayout();
                if (layout == null) {
                    return false;
                }
                o00Ooo o00ooo3 = o00ooo2;
                o00ooo3.f43681OooO0O0 = layout;
                o00ooo3.f43682OooO0OO = textView2.getScrollX() + textView2.getTotalPaddingLeft();
                o00ooo3.f43683OooO0Oo = textView2.getScrollY() + textView2.getTotalPaddingTop();
                CharSequence text = o00ooo3.f43681OooO0O0.getText();
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                if (spanned == null) {
                    return false;
                }
                int action = motionEvent.getAction() & 255;
                int x = (int) (motionEvent.getX() - o00ooo3.f43682OooO0OO);
                int y = (int) (motionEvent.getY() - o00ooo3.f43683OooO0Oo);
                if (x < 0 || x >= o00ooo3.f43681OooO0O0.getWidth() || y < 0 || y >= o00ooo3.f43681OooO0O0.getHeight()) {
                    o00ooo3.OooO00o();
                    return false;
                }
                int lineForVertical = o00ooo3.f43681OooO0O0.getLineForVertical(y);
                float f = x;
                if (f < o00ooo3.f43681OooO0O0.getLineLeft(lineForVertical) || f > o00ooo3.f43681OooO0O0.getLineRight(lineForVertical)) {
                    o00ooo3.OooO00o();
                    return false;
                }
                if (action == 0) {
                    int offsetForHorizontal = o00ooo3.f43681OooO0O0.getOffsetForHorizontal(lineForVertical, f);
                    o000oOoO[] o000ooooArr = (o000oOoO[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, o000oOoO.class);
                    if (o000ooooArr.length <= 0) {
                        return false;
                    }
                    o000oOoO o000oooo3 = o000ooooArr[0];
                    o000oooo3.OooO00o(true);
                    o00ooo3.f43684OooO0o0 = o000oooo3;
                    o00ooo3.OooO0O0();
                } else {
                    if (action != 1 || (o000oooo2 = o00ooo3.f43684OooO0o0) == null) {
                        return false;
                    }
                    o000oooo2.onClick(o00ooo3.f43680OooO00o);
                    o00ooo3.OooO00o();
                }
                return true;
            }
        });
        if (TextUtils.isEmpty(charSequenceSubSequence)) {
            this.f22288OooOOO0.setText("");
            this.f22288OooOOO0.setVisibility(8);
        } else {
            this.f22288OooOOO0.setText(charSequenceSubSequence);
            this.f22288OooOOO0.setVisibility(0);
        }
    }

    public void OooO00o() {
        this.f22278OooO = (TextView) findViewById(oo0o0Oo.tw__tweet_author_full_name);
        this.f22284OooOO0 = (TextView) findViewById(oo0o0Oo.tw__tweet_author_screen_name);
        this.f22285OooOO0O = (AspectRatioFrameLayout) findViewById(oo0o0Oo.tw__aspect_ratio_media_container);
        this.f22286OooOO0o = (TweetMediaView) findViewById(oo0o0Oo.tweet_media_view);
        this.f22288OooOOO0 = (TextView) findViewById(oo0o0Oo.tw__tweet_text);
        this.f22287OooOOO = (MediaBadgeView) findViewById(oo0o0Oo.tw__tweet_media_badge);
    }

    public double OooO0O0(MediaEntity mediaEntity) {
        MediaEntity.Sizes sizes;
        MediaEntity.Size size;
        int i;
        int i2;
        if (mediaEntity == null || (sizes = mediaEntity.f22027OooOO0o) == null || (size = sizes.f22036OooO0Oo) == null || (i = size.f22033OooO0Oo) == 0 || (i2 = size.f22035OooO0o0) == 0) {
            return 1.7777777777777777d;
        }
        return ((double) i) / ((double) i2);
    }

    public abstract double OooO0OO(int i);

    public void OooO0Oo() {
        User user;
        com.twitter.sdk.android.core.models.OooOo oooOo;
        com.twitter.sdk.android.core.models.OooOo oooOo2 = this.f22282OooO0oO;
        if (oooOo2 != null && (oooOo = oooOo2.f22089OooOoO0) != null) {
            oooOo2 = oooOo;
        }
        setName(oooOo2);
        setScreenName(oooOo2);
        setTweetMedia(oooOo2);
        setText(oooOo2);
        setContentDescription(oooOo2);
        com.twitter.sdk.android.core.models.OooOo oooOo3 = this.f22282OooO0oO;
        if ((oooOo3 == null || oooOo3.f22064OooO <= 0 || (user = oooOo3.f22093OooOooO) == null || TextUtils.isEmpty(user.f22186Oooo0O0)) ? false : true) {
            OooO0o0(this.f22282OooO0oO.f22093OooOooO.f22186Oooo0O0, Long.valueOf(getTweetId()));
        } else {
            this.f22280OooO0o = null;
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
        this.f22280OooO0o = uri;
    }

    public abstract int getLayout();

    public Oooo000 getLinkClickListener() {
        if (this.f22281OooO0o0 == null) {
            this.f22281OooO0o0 = new p671oo0oOOo.OooOo00(this);
        }
        return this.f22281OooO0o0;
    }

    public Uri getPermalinkUri() {
        return this.f22280OooO0o;
    }

    public com.twitter.sdk.android.core.models.OooOo getTweet() {
        return this.f22282OooO0oO;
    }

    public long getTweetId() {
        com.twitter.sdk.android.core.models.OooOo oooOo = this.f22282OooO0oO;
        if (oooOo == null) {
            return -1L;
        }
        return oooOo.f22064OooO;
    }

    public void setContentDescription(com.twitter.sdk.android.core.models.OooOo oooOo) {
        long time;
        User user;
        if (!((oooOo == null || oooOo.f22064OooO <= 0 || (user = oooOo.f22093OooOooO) == null || TextUtils.isEmpty(user.f22186Oooo0O0)) ? false : true)) {
            setContentDescription(getResources().getString(o000000.tw__loading_tweet));
            return;
        }
        this.f22279OooO0Oo.getClass();
        OooOO0O oooOO0OOooO00o = o0000O.OooO00o().f22442OooO00o.OooO00o(oooOo);
        String str = oooOO0OOooO00o != null ? oooOO0OOooO00o.f22302OooO00o : null;
        String str2 = oooOo.f22066OooO0O0;
        SimpleDateFormat simpleDateFormat = o00000O.f22436OooO00o;
        if (str2 == null) {
            time = -1;
        } else {
            try {
                time = o00000O.f22436OooO00o.parse(str2).getTime();
            } catch (ParseException unused) {
                time = -1;
            }
        }
        String str3 = time != -1 ? DateFormat.getDateInstance().format(new Date(time)) : null;
        Resources resources = getResources();
        int i = o000000.tw__tweet_content_description;
        Object[] objArr = new Object[3];
        String str4 = oooOo.f22093OooOooO.f22172OooOo0O;
        if (str4 == null) {
            str4 = "";
        }
        objArr[0] = str4;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        if (str3 == null) {
            str3 = "";
        }
        objArr[2] = str3;
        setContentDescription(resources.getString(i, objArr));
    }

    public void setTweet(com.twitter.sdk.android.core.models.OooOo oooOo) {
        this.f22282OooO0oO = oooOo;
        OooO0Oo();
    }

    public void setTweetLinkClickListener(o00000OO o00000oo2) {
    }

    public final void setTweetMedia(com.twitter.sdk.android.core.models.OooOo oooOo) {
        List<MediaEntity> list;
        List<MediaEntity> list2;
        List<MediaEntity> list3;
        Object obj;
        int i;
        this.f22285OooOO0O.setVisibility(8);
        if (oooOo == null) {
            return;
        }
        com.twitter.sdk.android.core.models.OooO0o oooO0o = oooOo.f22097Oooo00o;
        Object obj2 = null;
        if (oooO0o != null && o0OOOOO.Oooo000.OooO00o(oooO0o)) {
            com.twitter.sdk.android.core.models.OooO0o oooO0o2 = oooOo.f22097Oooo00o;
            com.twitter.sdk.android.core.models.OooO0OO oooO0OO = oooO0o2.f22050OooO00o;
            oooO0OO.getClass();
            try {
                obj = oooO0OO.f22049OooO00o.get("player_image");
            } catch (ClassCastException unused) {
                obj = null;
            }
            com.twitter.sdk.android.core.models.OooOOO0 oooOOO0 = (com.twitter.sdk.android.core.models.OooOOO0) obj;
            com.twitter.sdk.android.core.models.OooO0OO oooO0OO2 = oooO0o2.f22050OooO00o;
            oooO0OO2.getClass();
            try {
                obj2 = oooO0OO2.f22049OooO00o.get("player_stream_url");
            } catch (ClassCastException unused2) {
            }
            String str = (String) obj2;
            if (oooOOO0 == null || TextUtils.isEmpty(str)) {
                return;
            }
            int i2 = oooOOO0.f22061OooO0O0;
            setViewsForMedia((i2 == 0 || (i = oooOOO0.f22060OooO00o) == 0) ? 1.7777777777777777d : ((double) i2) / ((double) i));
            this.f22286OooOO0o.setVineCard(oooOo);
            this.f22287OooOOO.setVisibility(0);
            this.f22287OooOOO.setCard(oooO0o2);
            return;
        }
        MediaEntity mediaEntityOooO0O0 = p347o0OOOOoo.o00oO0o.OooO0O0(oooOo);
        if ((mediaEntityOooO0O0 == null || p347o0OOOOoo.o00oO0o.OooO00o(mediaEntityOooO0O0) == null) ? false : true) {
            MediaEntity mediaEntityOooO0O1 = p347o0OOOOoo.o00oO0o.OooO0O0(oooOo);
            setViewsForMedia(OooO0O0(mediaEntityOooO0O1));
            this.f22286OooOO0o.OooO0o(this.f22282OooO0oO, Collections.singletonList(mediaEntityOooO0O1));
            this.f22287OooOOO.setVisibility(0);
            this.f22287OooOOO.setMediaEntity(mediaEntityOooO0O1);
            return;
        }
        ArrayList arrayList = new ArrayList();
        com.twitter.sdk.android.core.models.Oooo0 oooo0 = oooOo.f22068OooO0Oo;
        if (oooo0 != null && (list3 = oooo0.f22112OooO0OO) != null) {
            arrayList.addAll(list3);
        }
        com.twitter.sdk.android.core.models.Oooo0 oooo1 = oooOo.f22070OooO0o0;
        if (oooo1 != null && (list2 = oooo1.f22112OooO0OO) != null) {
            arrayList.addAll(list2);
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MediaEntity mediaEntity = (MediaEntity) arrayList.get(size);
            String str2 = mediaEntity.f22030OooOOOO;
            if (str2 != null && AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(str2)) {
                obj2 = mediaEntity;
                break;
            }
        }
        if (obj2 != null) {
            ArrayList arrayList2 = new ArrayList();
            com.twitter.sdk.android.core.models.Oooo0 oooo2 = oooOo.f22070OooO0o0;
            if (oooo2 != null && (list = oooo2.f22112OooO0OO) != null && list.size() > 0) {
                for (int i3 = 0; i3 <= oooo2.f22112OooO0OO.size() - 1; i3++) {
                    MediaEntity mediaEntity2 = oooo2.f22112OooO0OO.get(i3);
                    String str3 = mediaEntity2.f22030OooOOOO;
                    if (str3 != null && AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(str3)) {
                        arrayList2.add(mediaEntity2);
                    }
                }
            }
            setViewsForMedia(OooO0OO(arrayList2.size()));
            this.f22286OooOO0o.OooO0o(oooOo, arrayList2);
            this.f22287OooOOO.setVisibility(8);
        }
    }

    public void setTweetMediaClickListener(o0000Ooo o0000ooo) {
        this.f22286OooOO0o.setTweetMediaClickListener(o0000ooo);
    }

    public void setViewsForMedia(double d) {
        this.f22285OooOO0O.setVisibility(0);
        this.f22285OooOO0O.setAspectRatio(d);
        this.f22286OooOO0o.setVisibility(0);
    }
}
