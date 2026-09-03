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
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.core.services.StatusesService;
import com.twitter.sdk.android.tweetui.o0000oo.OooO00o;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import p022Oooo00O.o00O00OO;
import p029Oooo0oo.o0OOO0OO;
import p211o00o0oo0.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTweetView extends OooO00o {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final /* synthetic */ int f21787Oooo00O = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView f21788OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public TextView f21789OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TweetActionBarView f21790OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ImageView f21791OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public TextView f21792OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ViewGroup f21793OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f21794OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public QuoteTweetView f21795OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f21796OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f21797OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ColorDrawable f21798Oooo000;

    public BaseTweetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setStyleAttributes(TypedArray typedArray) {
        this.f21796OooOooO = typedArray.getColor(o000000O.tw__TweetView_tw__container_bg_color, getResources().getColor(o0OOO0o.tw__tweet_light_container_bg_color));
        this.f21816OooOOOO = typedArray.getColor(o000000O.tw__TweetView_tw__primary_text_color, getResources().getColor(o0OOO0o.tw__tweet_light_primary_text_color));
        this.f21819OooOOo0 = typedArray.getColor(o000000O.tw__TweetView_tw__action_color, getResources().getColor(o0OOO0o.tw__tweet_action_color));
        this.f21818OooOOo = typedArray.getColor(o000000O.tw__TweetView_tw__action_highlight_color, getResources().getColor(o0OOO0o.tw__tweet_action_light_highlight_color));
        this.f21810OooO0oo = typedArray.getBoolean(o000000O.tw__TweetView_tw__tweet_actions_enabled, false);
        int i = this.f21796OooOooO;
        boolean z = (((double) Color.blue(i)) * 0.07d) + ((((double) Color.green(i)) * 0.72d) + (((double) Color.red(i)) * 0.21d)) > 128.0d;
        if (z) {
            this.f21821OooOo00 = o0OO00O.tw__ic_tweet_photo_error_light;
            this.f21797OooOooo = o0OO00O.tw__ic_logo_blue;
        } else {
            this.f21821OooOo00 = o0OO00O.tw__ic_tweet_photo_error_dark;
            this.f21797OooOooo = o0OO00O.tw__ic_logo_white;
        }
        this.f21817OooOOOo = com.google.gson.internal.o0OOO0o.OooO00o(z ? 0.4d : 0.35d, z ? -1 : -16777216, this.f21816OooOOOO);
        this.f21820OooOOoo = com.google.gson.internal.o0OOO0o.OooO00o(z ? 0.08d : 0.12d, z ? -16777216 : -1, this.f21796OooOooO);
        this.f21798Oooo000 = new ColorDrawable(this.f21820OooOOoo);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    private void setTimestamp(com.twitter.sdk.android.core.models.OooOo oooOo) {
        String strOooO00o;
        String str;
        long time;
        String strOooO00o2;
        String str2;
        if (oooOo == null || (str = oooOo.f21595OooO0O0) == null) {
            strOooO00o = "";
        } else {
            long time2 = -1;
            try {
                time = o00000O.f21962OooO00o.parse(str).getTime();
            } catch (ParseException unused) {
                time = -1;
            }
            if (time != -1) {
                String str3 = oooOo.f21595OooO0O0;
                if (str3 != null) {
                    try {
                        time2 = o00000O.f21962OooO00o.parse(str3).getTime();
                    } catch (ParseException unused2) {
                    }
                }
                Long lValueOf = Long.valueOf(time2);
                Resources resources = getResources();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = lValueOf.longValue();
                long j = jCurrentTimeMillis - jLongValue;
                if (j < 0) {
                    strOooO00o2 = o00000O.f21963OooO0O0.OooO00o(resources, new Date(jLongValue));
                } else if (j < 60000) {
                    int i = (int) (j / 1000);
                    strOooO00o2 = resources.getQuantityString(o000OOo.tw__time_secs, i, Integer.valueOf(i));
                } else if (j < 3600000) {
                    int i2 = (int) (j / 60000);
                    strOooO00o2 = resources.getQuantityString(o000OOo.tw__time_mins, i2, Integer.valueOf(i2));
                } else if (j < 86400000) {
                    int i3 = (int) (j / 3600000);
                    strOooO00o2 = resources.getQuantityString(o000OOo.tw__time_hours, i3, Integer.valueOf(i3));
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(jCurrentTimeMillis);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(jLongValue);
                    Date date = new Date(jLongValue);
                    if (calendar.get(1) == calendar2.get(1)) {
                        o00000O.OooO00o oooO00o = o00000O.f21963OooO0O0;
                        synchronized (oooO00o) {
                            str2 = oooO00o.OooO0O0(resources, o000000.tw__relative_date_format_short).format(date);
                        }
                        strOooO00o2 = str2;
                    } else {
                        strOooO00o2 = o00000O.f21963OooO0O0.OooO00o(resources, date);
                    }
                }
                strOooO00o = o00O00OO.OooO00o("• ", strOooO00o2);
            } else {
                strOooO00o = "";
            }
        }
        this.f21792OooOoO0.setText(strOooO00o);
    }

    private void setXmlDataAttributes(TypedArray typedArray) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(typedArray.getString(o000000O.tw__TweetView_tw__tweet_id)));
        } catch (NumberFormatException unused) {
            lValueOf = -1L;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue <= 0) {
            throw new IllegalArgumentException("Invalid tw__tweet_id");
        }
        OooO0o0(null, Long.valueOf(jLongValue));
        this.f21809OooO0oO = new com.twitter.sdk.android.core.models.OooOo(null, null, null, null, null, null, false, null, jLongValue, null, null, 0L, null, 0L, null, null, null, false, null, 0L, null, null, 0, false, null, null, null, null, false, null, false, null, null, null);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public final void OooO00o() {
        super.OooO00o();
        this.f21791OooOoO = (ImageView) findViewById(oo0o0Oo.tw__tweet_author_avatar);
        this.f21792OooOoO0 = (TextView) findViewById(oo0o0Oo.tw__tweet_timestamp);
        this.f21788OooOo = (ImageView) findViewById(oo0o0Oo.tw__twitter_logo);
        this.f21789OooOo0O = (TextView) findViewById(oo0o0Oo.tw__tweet_retweeted_by);
        this.f21790OooOo0o = (TweetActionBarView) findViewById(oo0o0Oo.tw__tweet_action_bar);
        this.f21793OooOoOO = (ViewGroup) findViewById(oo0o0Oo.quote_tweet_holder);
        this.f21794OooOoo = findViewById(oo0o0Oo.bottom_separator);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public void OooO0Oo() {
        com.twitter.sdk.android.core.models.OooOo oooOo;
        super.OooO0Oo();
        final com.twitter.sdk.android.core.models.OooOo oooOo2 = this.f21809OooO0oO;
        if (oooOo2 != null && (oooOo = oooOo2.f21618OooOoO0) != null) {
            oooOo2 = oooOo;
        }
        setProfilePhotoView(oooOo2);
        if (oooOo2 != null && oooOo2.f21622OooOooO != null) {
            this.f21791OooOoO.setOnClickListener(new View.OnClickListener() { // from class: com.twitter.sdk.android.tweetui.OooO0OO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = BaseTweetView.f21787Oooo00O;
                    BaseTweetView baseTweetView = this.f21824OooO0Oo;
                    baseTweetView.getClass();
                    if (o000OOo0.OooO0O0(baseTweetView.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(o000.OooO00o(oooOo2.f21622OooOooO.f21715Oooo0O0))))) {
                        return;
                    }
                    com.twitter.sdk.android.core.o00O0O.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to open URL");
                }
            });
            this.f21791OooOoO.setOnTouchListener(new View.OnTouchListener() { // from class: com.twitter.sdk.android.tweetui.OooO0o
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i = BaseTweetView.f21787Oooo00O;
                    BaseTweetView baseTweetView = this.f21826OooO0Oo;
                    baseTweetView.getClass();
                    ImageView imageView = (ImageView) view;
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        imageView.getDrawable().setColorFilter(baseTweetView.getResources().getColor(o0OOO0o.tw__black_opacity_10), PorterDuff.Mode.SRC_ATOP);
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
        setTimestamp(oooOo2);
        setTweetActions(this.f21809OooO0oO);
        com.twitter.sdk.android.core.models.OooOo oooOo3 = this.f21809OooO0oO;
        if (oooOo3 == null || oooOo3.f21618OooOoO0 == null) {
            this.f21789OooOo0O.setVisibility(8);
        } else {
            this.f21789OooOo0O.setText(getResources().getString(o000000.tw__retweeted_by_format, oooOo3.f21622OooOooO.f21701OooOo0O));
            this.f21789OooOo0O.setVisibility(0);
        }
        setQuoteTweet(this.f21809OooO0oO);
    }

    public void OooO0o() {
        setBackgroundColor(this.f21796OooOooO);
        this.f21805OooO.setTextColor(this.f21816OooOOOO);
        this.f21811OooOO0.setTextColor(this.f21817OooOOOo);
        this.f21815OooOOO0.setTextColor(this.f21816OooOOOO);
        this.f21813OooOO0o.setMediaBgColor(this.f21820OooOOoo);
        this.f21813OooOO0o.setPhotoErrorResId(this.f21821OooOo00);
        this.f21791OooOoO.setImageDrawable(this.f21798Oooo000);
        this.f21792OooOoO0.setTextColor(this.f21817OooOOOo);
        this.f21788OooOo.setImageResource(this.f21797OooOooo);
        this.f21789OooOo0O.setTextColor(this.f21817OooOOOo);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ com.twitter.sdk.android.core.models.OooOo getTweet() {
        return super.getTweet();
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ long getTweetId() {
        return super.getTweetId();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        com.twitter.sdk.android.core.o00Oo0 o00oo0OooO00o;
        super.onFinishInflate();
        boolean z = false;
        if (!isInEditMode()) {
            try {
                this.f21806OooO0Oo.getClass();
                o0000OO0.OooO00o();
                z = true;
            } catch (IllegalStateException e) {
                com.twitter.sdk.android.core.o00O0O.OooO0OO().OooO00o("TweetUi", e.getMessage());
                setEnabled(false);
            }
        }
        if (z) {
            setTweetActionsEnabled(this.f21810OooO0oo);
            TweetActionBarView tweetActionBarView = this.f21790OooOo0o;
            this.f21806OooO0Oo.getClass();
            tweetActionBarView.setOnActionCallback(new o00000(this, o0000OO0.OooO00o().f21973OooO00o, null));
            OooO oooO = new OooO(this, getTweetId());
            this.f21806OooO0Oo.getClass();
            o0000oo o0000ooVar = o0000OO0.OooO00o().f21973OooO00o;
            long tweetId = getTweetId();
            com.twitter.sdk.android.core.models.OooOo oooOo = o0000ooVar.f21978OooO0Oo.get(Long.valueOf(tweetId));
            if (oooOo != null) {
                o0000ooVar.f21976OooO0O0.post(new o0OOO0OO(2, oooO, oooOo));
                return;
            }
            com.twitter.sdk.android.core.o0ooOOo o0ooooo = o0000ooVar.f21975OooO00o;
            com.twitter.sdk.android.core.o0OOO0o o0ooo0o2 = (com.twitter.sdk.android.core.o0OOO0o) o0ooooo.f21753OooO00o.OooO0OO();
            if (o0ooo0o2 == null) {
                if (o0ooooo.f21757OooO0o == null) {
                    synchronized (o0ooooo) {
                        if (o0ooooo.f21757OooO0o == null) {
                            o0ooooo.f21757OooO0o = new com.twitter.sdk.android.core.o00Oo0();
                        }
                    }
                }
                o00oo0OooO00o = o0ooooo.f21757OooO0o;
            } else {
                o00oo0OooO00o = o0ooooo.OooO00o(o0ooo0o2);
            }
            ((StatusesService) o00oo0OooO00o.OooO00o(StatusesService.class)).show(Long.valueOf(tweetId), null, null, null).OooOooo(o0000ooVar.new OooO00o(oooO));
        }
    }

    public void setOnActionCallback(com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0) {
        TweetActionBarView tweetActionBarView = this.f21790OooOo0o;
        this.f21806OooO0Oo.getClass();
        tweetActionBarView.setOnActionCallback(new o00000(this, o0000OO0.OooO00o().f21973OooO00o, oooO0O0));
        this.f21790OooOo0o.setTweet(this.f21809OooO0oO);
    }

    public void setProfilePhotoView(com.twitter.sdk.android.core.models.OooOo oooOo) {
        User user;
        this.f21806OooO0Oo.getClass();
        Picasso picasso = o0000OO0.OooO00o().f21974OooO0O0;
        if (picasso == null) {
            return;
        }
        com.squareup.picasso.oo000o oo000oVarOooO0Oo = picasso.OooO0Oo((oooOo == null || (user = oooOo.f21622OooOooO) == null) ? null : UserUtils.OooO00o(user, UserUtils.AvatarSize.REASONABLY_SMALL));
        oo000oVarOooO0Oo.f21381OooO0o0 = this.f21798Oooo000;
        oo000oVarOooO0Oo.OooO0O0(this.f21791OooOoO, null);
    }

    public void setQuoteTweet(com.twitter.sdk.android.core.models.OooOo oooOo) {
        com.twitter.sdk.android.core.models.Oooo0 oooo0;
        List<MediaEntity> list;
        this.f21795OooOoo0 = null;
        this.f21793OooOoOO.removeAllViews();
        if (oooOo != null) {
            if (oooOo.f21615OooOo0O != null && oooOo.f21626Oooo00o == null && ((oooo0 = oooOo.f21597OooO0Oo) == null || (list = oooo0.f21641OooO0OO) == null || list.isEmpty())) {
                QuoteTweetView quoteTweetView = new QuoteTweetView(getContext());
                this.f21795OooOoo0 = quoteTweetView;
                int i = this.f21816OooOOOO;
                int i2 = this.f21817OooOOOo;
                int i3 = this.f21819OooOOo0;
                int i4 = this.f21818OooOOo;
                int i5 = this.f21820OooOOoo;
                int i6 = this.f21821OooOo00;
                quoteTweetView.f21816OooOOOO = i;
                quoteTweetView.f21817OooOOOo = i2;
                quoteTweetView.f21819OooOOo0 = i3;
                quoteTweetView.f21818OooOOo = i4;
                quoteTweetView.f21820OooOOoo = i5;
                quoteTweetView.f21821OooOo00 = i6;
                int dimensionPixelSize = quoteTweetView.getResources().getDimensionPixelSize(o0Oo0oo.tw__media_view_radius);
                quoteTweetView.f21813OooOO0o.OooO0o0(0, 0, dimensionPixelSize, dimensionPixelSize);
                quoteTweetView.setBackgroundResource(o0OO00O.tw__quote_tweet_border);
                quoteTweetView.f21805OooO.setTextColor(quoteTweetView.f21816OooOOOO);
                quoteTweetView.f21811OooOO0.setTextColor(quoteTweetView.f21817OooOOOo);
                quoteTweetView.f21815OooOOO0.setTextColor(quoteTweetView.f21816OooOOOO);
                quoteTweetView.f21813OooOO0o.setMediaBgColor(quoteTweetView.f21820OooOOoo);
                quoteTweetView.f21813OooOO0o.setPhotoErrorResId(quoteTweetView.f21821OooOo00);
                this.f21795OooOoo0.setTweet(oooOo.f21615OooOo0O);
                this.f21795OooOoo0.setTweetLinkClickListener(null);
                this.f21795OooOoo0.setTweetMediaClickListener(null);
                this.f21793OooOoOO.setVisibility(0);
                this.f21793OooOoOO.addView(this.f21795OooOoo0);
                return;
            }
        }
        this.f21793OooOoOO.setVisibility(8);
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public /* bridge */ /* synthetic */ void setTweet(com.twitter.sdk.android.core.models.OooOo oooOo) {
        super.setTweet(oooOo);
    }

    public void setTweetActions(com.twitter.sdk.android.core.models.OooOo oooOo) {
        this.f21790OooOo0o.setTweet(oooOo);
    }

    public void setTweetActionsEnabled(boolean z) {
        this.f21810OooO0oo = z;
        if (z) {
            this.f21790OooOo0o.setVisibility(0);
            this.f21794OooOoo.setVisibility(8);
        } else {
            this.f21790OooOo0o.setVisibility(8);
            this.f21794OooOoo.setVisibility(0);
        }
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public void setTweetLinkClickListener(o00000OO o00000oo2) {
        super.setTweetLinkClickListener(o00000oo2);
        QuoteTweetView quoteTweetView = this.f21795OooOoo0;
        if (quoteTweetView != null) {
            quoteTweetView.setTweetLinkClickListener(o00000oo2);
        }
    }

    @Override // com.twitter.sdk.android.tweetui.OooO00o
    public void setTweetMediaClickListener(o0000Ooo o0000ooo) {
        super.setTweetMediaClickListener(o0000ooo);
        QuoteTweetView quoteTweetView = this.f21795OooOoo0;
        if (quoteTweetView != null) {
            quoteTweetView.setTweetMediaClickListener(o0000ooo);
        }
    }

    public BaseTweetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, new OooO00o.C0281OooO00o());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o000000O.tw__TweetView, 0, 0);
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
