package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.billingclient.api.o0OoOo0;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.o000oOoO;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.core.services.StatusesService;
import com.twitter.sdk.android.tweetui.BaseTweetView;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import o0OoOOo0.o00O0O00.OooO00o;
import p016OooOoO0.OooOo00;
import p418o0Oo0oo.oo000o;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O00o00;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0O0oo0o;
import p433o0OoOO0o.o0oO0Ooo;
import p436o0OoOOOO.o0O00OOO;
import p439o0OoOOo0.o00;
import p439o0OoOOo0.o0000;
import p439o0OoOOo0.o0000O00;
import p439o0OoOOo0.o000O;
import p439o0OoOOo0.o000OO00;
import p439o0OoOOo0.o000OOo0;
import p439o0OoOOo0.o00O000;
import p439o0OoOOo0.o00O000o;
import p439o0OoOOo0.o00O00O;
import p439o0OoOOo0.o00O00OO;
import p439o0OoOOo0.o00O0O00;
import p439o0OoOOo0.o00O0OO0;
import p439o0OoOOo0.o00oOoo;
import p439o0OoOOo0.o0O0ooO;
import p439o0OoOOo0.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTweetView extends OooO00o {

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public static final /* synthetic */ int f20086o00ooo = 0;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public TextView f20087OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public ImageView f20088Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public TweetActionBarView f20089Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public TextView f20090OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public ImageView f20091Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public View f20092o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f20093o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f20094o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public ColorDrawable f20095o00o0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public ViewGroup f20096o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public QuoteTweetView f20097ooOO;

    public BaseTweetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setStyleAttributes(TypedArray typedArray) {
        this.f20093o00Oo0 = typedArray.getColor(o00O000.tw__TweetView_tw__container_bg_color, getResources().getColor(o000O.tw__tweet_light_container_bg_color));
        this.f20113OoooOoO = typedArray.getColor(o00O000.tw__TweetView_tw__primary_text_color, getResources().getColor(o000O.tw__tweet_light_primary_text_color));
        this.f20115Ooooo00 = typedArray.getColor(o00O000.tw__TweetView_tw__action_color, getResources().getColor(o000O.tw__tweet_action_color));
        this.f20116Ooooo0o = typedArray.getColor(o00O000.tw__TweetView_tw__action_highlight_color, getResources().getColor(o000O.tw__tweet_action_light_highlight_color));
        this.f20108OoooO0O = typedArray.getBoolean(o00O000.tw__TweetView_tw__tweet_actions_enabled, false);
        int i = this.f20093o00Oo0;
        boolean z = (((double) Color.blue(i)) * 0.07d) + ((((double) Color.green(i)) * 0.72d) + (((double) Color.red(i)) * 0.21d)) > 128.0d;
        if (z) {
            this.f20118OooooOO = o000OOo0.tw__ic_tweet_photo_error_light;
            this.f20094o00Ooo = o000OOo0.tw__ic_logo_blue;
        } else {
            this.f20118OooooOO = o000OOo0.tw__ic_tweet_photo_error_dark;
            this.f20094o00Ooo = o000OOo0.tw__ic_logo_white;
        }
        this.f20114OoooOoo = o0000O00.OooO00o(z ? 0.4d : 0.35d, z ? -1 : -16777216, this.f20113OoooOoO);
        this.f20117OooooO0 = o0000O00.OooO00o(z ? 0.08d : 0.12d, z ? -16777216 : -1, this.f20093o00Oo0);
        this.f20095o00o0O = new ColorDrawable(this.f20117OooooO0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    private void setTimestamp(o0O00OOO o0o00ooo2) {
        String strOooO0Oo;
        String str;
        String str2;
        String quantityString;
        if (o0o00ooo2 == null || (str = o0o00ooo2.f40004OooO0O0) == null) {
            strOooO0Oo = "";
        } else {
            if (o00O00O.OooO00o(str) != -1) {
                Long lValueOf = Long.valueOf(o00O00O.OooO00o(o0o00ooo2.f40004OooO0O0));
                Resources resources = getResources();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = lValueOf.longValue();
                long j = jCurrentTimeMillis - jLongValue;
                if (j >= 0) {
                    if (j < 60000) {
                        int i = (int) (j / 1000);
                        quantityString = resources.getQuantityString(o0O0ooO.tw__time_secs, i, Integer.valueOf(i));
                    } else if (j < 3600000) {
                        int i2 = (int) (j / 60000);
                        quantityString = resources.getQuantityString(o0O0ooO.tw__time_mins, i2, Integer.valueOf(i2));
                    } else if (j < 86400000) {
                        int i3 = (int) (j / 3600000);
                        quantityString = resources.getQuantityString(o0O0ooO.tw__time_hours, i3, Integer.valueOf(i3));
                    } else {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(jCurrentTimeMillis);
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(jLongValue);
                        Date date = new Date(jLongValue);
                        if (calendar.get(1) == calendar2.get(1)) {
                            o00O00O.OooO00o oooO00o = o00O00O.f40157OooO0O0;
                            synchronized (oooO00o) {
                                str2 = oooO00o.OooO00o(resources, o00oOoo.tw__relative_date_format_short).format(date);
                            }
                        } else {
                            o00O00O.OooO00o oooO00o2 = o00O00O.f40157OooO0O0;
                            synchronized (oooO00o2) {
                                str2 = oooO00o2.OooO00o(resources, o00oOoo.tw__relative_date_format_long).format(date);
                            }
                        }
                    }
                    strOooO0Oo = OooOo00.OooO0Oo("• ", quantityString);
                } else {
                    o00O00O.OooO00o oooO00o3 = o00O00O.f40157OooO0O0;
                    Date date2 = new Date(jLongValue);
                    synchronized (oooO00o3) {
                        str2 = oooO00o3.OooO00o(resources, o00oOoo.tw__relative_date_format_long).format(date2);
                    }
                }
                quantityString = str2;
                strOooO0Oo = OooOo00.OooO0Oo("• ", quantityString);
            } else {
                strOooO0Oo = "";
            }
        }
        this.f20090OoooooO.setText(strOooO0Oo);
    }

    private void setXmlDataAttributes(TypedArray typedArray) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(typedArray.getString(o00O000.tw__TweetView_tw__tweet_id)));
        } catch (NumberFormatException unused) {
            lValueOf = -1L;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue <= 0) {
            throw new IllegalArgumentException("Invalid tw__tweet_id");
        }
        OooO0o0(null, Long.valueOf(jLongValue));
        this.f20106OoooO0 = new o0O00OOO(null, null, null, null, null, null, false, null, jLongValue, null, null, 0L, null, 0L, null, null, null, false, null, 0L, null, null, 0, false, null, null, null, null, false, null, false, null, null, null);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public final void OooO00o() {
        super.OooO00o();
        this.f20091Ooooooo = (ImageView) findViewById(o00.tw__tweet_author_avatar);
        this.f20090OoooooO = (TextView) findViewById(o00.tw__tweet_timestamp);
        this.f20088Oooooo = (ImageView) findViewById(o00.tw__twitter_logo);
        this.f20087OooooOo = (TextView) findViewById(o00.tw__tweet_retweeted_by);
        this.f20089Oooooo0 = (TweetActionBarView) findViewById(o00.tw__tweet_action_bar);
        this.f20096o0OoOo0 = (ViewGroup) findViewById(o00.quote_tweet_holder);
        this.f20092o00O0O = findViewById(o00.bottom_separator);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public void OooO0Oo() {
        o0O00OOO o0o00ooo2;
        super.OooO0Oo();
        final o0O00OOO o0o00ooo3 = this.f20106OoooO0;
        if (o0o00ooo3 != null && (o0o00ooo2 = o0o00ooo3.f40027OooOoO0) != null) {
            o0o00ooo3 = o0o00ooo2;
        }
        setProfilePhotoView(o0o00ooo3);
        if (o0o00ooo3 != null && o0o00ooo3.f40031OooOooO != null) {
            this.f20091Ooooooo.setOnClickListener(new View.OnClickListener() { // from class: o0OoOOo0.o00000OO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseTweetView baseTweetView = this.f40121Oooo0o;
                    o0O00OOO o0o00ooo4 = o0o00ooo3;
                    int i = BaseTweetView.f20086o00ooo;
                    oOO00O ooo00o = baseTweetView.f20104Oooo0oo;
                    if (ooo00o != null) {
                        o0OoOo0.OooO00o(o0o00ooo4.f40031OooOooO.f20042o00oO0o);
                        ooo00o.OooO00o();
                    } else {
                        if (oo000o.OooO0OO(baseTweetView.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(o0OoOo0.OooO00o(o0o00ooo4.f40031OooOooO.f20042o00oO0o))))) {
                            return;
                        }
                        o0oO0Ooo.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to open URL");
                    }
                }
            });
            this.f20091Ooooooo.setOnTouchListener(new View.OnTouchListener() { // from class: o0OoOOo0.o0000Ooo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    BaseTweetView baseTweetView = this.f40138Oooo0o;
                    int i = BaseTweetView.f20086o00ooo;
                    Objects.requireNonNull(baseTweetView);
                    ImageView imageView = (ImageView) view;
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        imageView.getDrawable().setColorFilter(baseTweetView.getResources().getColor(o000O.tw__black_opacity_10), PorterDuff.Mode.SRC_ATOP);
                        imageView.invalidate();
                        return false;
                    }
                    if (action == 1) {
                        view.performClick();
                    } else if (action != 3) {
                        return false;
                    }
                    imageView.getDrawable().clearColorFilter();
                    imageView.invalidate();
                    return false;
                }
            });
        }
        setTimestamp(o0o00ooo3);
        setTweetActions(this.f20106OoooO0);
        o0O00OOO o0o00ooo4 = this.f20106OoooO0;
        if (o0o00ooo4 == null || o0o00ooo4.f40027OooOoO0 == null) {
            this.f20087OooooOo.setVisibility(8);
        } else {
            this.f20087OooooOo.setText(getResources().getString(o00oOoo.tw__retweeted_by_format, o0o00ooo4.f40031OooOooO.f20030OooooOO));
            this.f20087OooooOo.setVisibility(0);
        }
        setQuoteTweet(this.f20106OoooO0);
    }

    public void OooO0o() {
        setBackgroundColor(this.f20093o00Oo0);
        this.f20105OoooO.setTextColor(this.f20113OoooOoO);
        this.f20109OoooOO0.setTextColor(this.f20114OoooOoo);
        this.f20111OoooOOo.setTextColor(this.f20113OoooOoO);
        this.f20110OoooOOO.setMediaBgColor(this.f20117OooooO0);
        this.f20110OoooOOO.setPhotoErrorResId(this.f20118OooooOO);
        this.f20091Ooooooo.setImageDrawable(this.f20095o00o0O);
        this.f20090OoooooO.setTextColor(this.f20114OoooOoo);
        this.f20088Oooooo.setImageResource(this.f20094o00Ooo);
        this.f20087OooooOo.setTextColor(this.f20114OoooOoo);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ o0O00OOO getTweet() {
        return super.getTweet();
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ long getTweetId() {
        return super.getTweetId();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [o0OoOO0o.o0O000O, o0OoOO0o.o0O00OOO<o0OoOO0o.o0O0O0Oo>] */
    @Override // android.view.View
    public final void onFinishInflate() {
        o0O00o00 o0o00o00OooO00o;
        super.onFinishInflate();
        boolean z = false;
        if (!isInEditMode()) {
            try {
                Objects.requireNonNull(this.f20102Oooo0o);
                o00O0OO0.OooO00o();
                z = true;
            } catch (IllegalStateException e) {
                o0oO0Ooo.OooO0OO().OooO00o("TweetUi", e.getMessage());
                setEnabled(false);
            }
        }
        if (z) {
            setTweetActionsEnabled(this.f20108OoooO0O);
            TweetActionBarView tweetActionBarView = this.f20089Oooooo0;
            Objects.requireNonNull(this.f20102Oooo0o);
            tweetActionBarView.setOnActionCallback(new o00O000o(this, o00O0OO0.OooO00o().f40174OooO00o, null));
            final o0000 o0000Var = new o0000(this, getTweetId());
            Objects.requireNonNull(this.f20102Oooo0o);
            o00O0O00 o00o0o01 = o00O0OO0.OooO00o().f40174OooO00o;
            long tweetId = getTweetId();
            final o0O00OOO o0o00ooo2 = o00o0o01.f40167OooO0Oo.get(Long.valueOf(tweetId));
            if (o0o00ooo2 != null) {
                o00o0o01.f40165OooO0O0.post(new Runnable() { // from class: o0OoOOo0.o00O00o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0000Var.OooO0Oo(new o0O00O(o0o00ooo2, null));
                    }
                });
                return;
            }
            o0O0oo0o o0o0oo0o = o00o0o01.f40164OooO00o;
            o0O0O0Oo o0o0o0oo = (o0O0O0Oo) o0o0oo0o.f39949OooO00o.OooO0OO();
            if (o0o0o0oo == null) {
                if (o0o0oo0o.f39955OooO0oO == null) {
                    synchronized (o0o0oo0o) {
                        if (o0o0oo0o.f39955OooO0oO == null) {
                            o0o0oo0o.f39955OooO0oO = new o0O00o00();
                        }
                    }
                }
                o0o00o00OooO00o = o0o0oo0o.f39955OooO0oO;
            } else {
                o0o00o00OooO00o = o0o0oo0o.OooO00o(o0o0o0oo);
            }
            ((StatusesService) o0o00o00OooO00o.OooO00o(StatusesService.class)).show(Long.valueOf(tweetId), null, null, null).OoooOo0(o00o0o01.new OooO00o(o0000Var));
        }
    }

    public void setOnActionCallback(o0O0o<o0O00OOO> o0o0o) {
        TweetActionBarView tweetActionBarView = this.f20089Oooooo0;
        Objects.requireNonNull(this.f20102Oooo0o);
        tweetActionBarView.setOnActionCallback(new o00O000o(this, o00O0OO0.OooO00o().f40174OooO00o, o0o0o));
        this.f20089Oooooo0.setTweet(this.f20106OoooO0);
    }

    public void setProfilePhotoView(o0O00OOO o0o00ooo2) {
        User user;
        Objects.requireNonNull(this.f20102Oooo0o);
        Picasso picasso = o00O0OO0.OooO00o().f40175OooO0O0;
        if (picasso == null) {
            return;
        }
        o000oOoO o000ooooOooO0Oo = picasso.OooO0Oo((o0o00ooo2 == null || (user = o0o00ooo2.f40031OooOooO) == null) ? null : UserUtils.OooO00o(user, UserUtils.AvatarSize.REASONABLY_SMALL));
        o000ooooOooO0Oo.f19819OooO0o0 = this.f20095o00o0O;
        o000ooooOooO0Oo.OooO0O0(this.f20091Ooooooo, null);
    }

    public void setQuoteTweet(o0O00OOO o0o00ooo2) {
        this.f20097ooOO = null;
        this.f20096o0OoOo0.removeAllViews();
        if (o0o00ooo2 == null || !o0OoOo0.OooO0OO(o0o00ooo2)) {
            this.f20096o0OoOo0.setVisibility(8);
            return;
        }
        QuoteTweetView quoteTweetView = new QuoteTweetView(getContext());
        this.f20097ooOO = quoteTweetView;
        int i = this.f20113OoooOoO;
        int i2 = this.f20114OoooOoo;
        int i3 = this.f20115Ooooo00;
        int i4 = this.f20116Ooooo0o;
        int i5 = this.f20117OooooO0;
        int i6 = this.f20118OooooOO;
        quoteTweetView.f20113OoooOoO = i;
        quoteTweetView.f20114OoooOoo = i2;
        quoteTweetView.f20115Ooooo00 = i3;
        quoteTweetView.f20116Ooooo0o = i4;
        quoteTweetView.f20117OooooO0 = i5;
        quoteTweetView.f20118OooooOO = i6;
        int dimensionPixelSize = quoteTweetView.getResources().getDimensionPixelSize(o000OO00.tw__media_view_radius);
        quoteTweetView.f20110OoooOOO.OooO0oo(0, 0, dimensionPixelSize, dimensionPixelSize);
        quoteTweetView.setBackgroundResource(o000OOo0.tw__quote_tweet_border);
        quoteTweetView.f20105OoooO.setTextColor(quoteTweetView.f20113OoooOoO);
        quoteTweetView.f20109OoooOO0.setTextColor(quoteTweetView.f20114OoooOoo);
        quoteTweetView.f20111OoooOOo.setTextColor(quoteTweetView.f20113OoooOoO);
        quoteTweetView.f20110OoooOOO.setMediaBgColor(quoteTweetView.f20117OooooO0);
        quoteTweetView.f20110OoooOOO.setPhotoErrorResId(quoteTweetView.f20118OooooOO);
        this.f20097ooOO.setTweet(o0o00ooo2.f40024OooOo0O);
        this.f20097ooOO.setTweetLinkClickListener(this.f20104Oooo0oo);
        this.f20097ooOO.setTweetMediaClickListener(this.f20101Oooo);
        this.f20096o0OoOo0.setVisibility(0);
        this.f20096o0OoOo0.addView(this.f20097ooOO);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ void setTweet(o0O00OOO o0o00ooo2) {
        super.setTweet(o0o00ooo2);
    }

    public void setTweetActions(o0O00OOO o0o00ooo2) {
        this.f20089Oooooo0.setTweet(o0o00ooo2);
    }

    public void setTweetActionsEnabled(boolean z) {
        this.f20108OoooO0O = z;
        if (z) {
            this.f20089Oooooo0.setVisibility(0);
            this.f20092o00O0O.setVisibility(8);
        } else {
            this.f20089Oooooo0.setVisibility(8);
            this.f20092o00O0O.setVisibility(0);
        }
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public void setTweetLinkClickListener(oOO00O ooo00o) {
        super.setTweetLinkClickListener(ooo00o);
        QuoteTweetView quoteTweetView = this.f20097ooOO;
        if (quoteTweetView != null) {
            quoteTweetView.setTweetLinkClickListener(ooo00o);
        }
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public void setTweetMediaClickListener(o00O00OO o00o00oo2) {
        super.setTweetMediaClickListener(o00o00oo2);
        QuoteTweetView quoteTweetView = this.f20097ooOO;
        if (quoteTweetView != null) {
            quoteTweetView.setTweetMediaClickListener(o00o00oo2);
        }
    }

    public BaseTweetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, new OooO00o.C0182OooO00o());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o00O000.tw__TweetView, 0, 0);
            try {
                setXmlDataAttributes(typedArrayObtainStyledAttributes);
                setStyleAttributes(typedArrayObtainStyledAttributes);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        OooO0o();
    }
}
