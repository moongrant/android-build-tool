package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.o00000;
import com.google.android.exoplayer2.ui.o00000O0;
import com.squareup.picasso.Picasso;
import com.twitter.Extractor;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetcomposer.ComposerView;
import com.twitter.sdk.android.tweetcomposer.OooO00o;
import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.regex.Matcher;
import p345o0OOOOo.o00Oo0;
import p345o0OOOOo.o00Ooo;
import p345o0OOOOo.o00oO0o;
import p345o0OOOOo.o0OoOo0;
import p345o0OOOOo.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public class ComposerView extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ObservableScrollView f22237OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ImageView f22238OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public EditText f22239OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView f22240OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f22241OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Button f22242OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public View f22243OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ColorDrawable f22244OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ImageView f22245OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Picasso f22246OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public com.twitter.sdk.android.tweetcomposer.OooO00o.InterfaceC0281OooO00o f22247OooOOO0;

    public class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int iCodePointCount;
            ?? EmptyList;
            ComposerView composerView = ComposerView.this;
            com.twitter.sdk.android.tweetcomposer.OooO00o.InterfaceC0281OooO00o interfaceC0281OooO00o = composerView.f22247OooOOO0;
            String tweetText = composerView.getTweetText();
            com.twitter.sdk.android.tweetcomposer.OooO00o oooO00o = com.twitter.sdk.android.tweetcomposer.OooO00o.this;
            oooO00o.getClass();
            boolean z = false;
            if (TextUtils.isEmpty(tweetText)) {
                iCodePointCount = 0;
            } else {
                com.twitter.OooO00o oooO00o2 = oooO00o.f22253OooO0o0.f22255OooO00o;
                oooO00o2.getClass();
                String strNormalize = Normalizer.normalize(tweetText, Normalizer.Form.NFC);
                iCodePointCount = strNormalize.codePointCount(0, strNormalize.length());
                oooO00o2.f21959OooO00o.getClass();
                if (strNormalize.length() == 0 || strNormalize.indexOf(46) == -1) {
                    EmptyList = Collections.emptyList();
                } else {
                    EmptyList = new ArrayList();
                    Matcher matcher = o0OOOO.OooO00o.f43609OooO00o.matcher(strNormalize);
                    while (matcher.find()) {
                        if (matcher.group(4) != null || !o0OOOO.OooO00o.f43611OooO0OO.matcher(matcher.group(2)).matches()) {
                            String strGroup = matcher.group(3);
                            int iStart = matcher.start(3);
                            int iEnd = matcher.end(3);
                            Matcher matcher2 = o0OOOO.OooO00o.f43610OooO0O0.matcher(strGroup);
                            if (matcher2.find()) {
                                strGroup = matcher2.group();
                                iEnd = strGroup.length() + iStart;
                            }
                            EmptyList.add(new Extractor.Entity(iStart, iEnd, strGroup, Extractor.Entity.Type.URL));
                        }
                    }
                }
                for (Extractor.Entity entity : EmptyList) {
                    int i = (entity.f21955OooO00o - entity.f21956OooO0O0) + iCodePointCount;
                    entity.f21957OooO0OO.toLowerCase().startsWith("https://");
                    iCodePointCount = i + 23;
                }
            }
            ComposerView composerView2 = oooO00o.f22249OooO00o;
            composerView2.setCharCount(140 - iCodePointCount);
            if (iCodePointCount > 140) {
                composerView2.setCharCountTextStyle(o00oO0o.tw__ComposerCharCountOverflow);
            } else {
                composerView2.setCharCountTextStyle(o00oO0o.tw__ComposerCharCount);
            }
            if (iCodePointCount > 0 && iCodePointCount <= 140) {
                z = true;
            }
            composerView2.f22242OooO0oo.setEnabled(z);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public ComposerView(Context context) {
        this(context, null);
    }

    public final void OooO00o(Context context) {
        this.f22246OooOOO = Picasso.OooO0o(getContext());
        this.f22244OooOO0O = new ColorDrawable(context.getResources().getColor(o00Oo0.tw__composer_light_gray));
        View.inflate(context, oo000o.tw__composer_view, this);
    }

    public String getTweetText() {
        return this.f22239OooO0o.getText().toString();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f22238OooO0Oo = (ImageView) findViewById(o00Ooo.tw__author_avatar);
        this.f22240OooO0o0 = (ImageView) findViewById(o00Ooo.tw__composer_close);
        this.f22239OooO0o = (EditText) findViewById(o00Ooo.tw__edit_tweet);
        this.f22241OooO0oO = (TextView) findViewById(o00Ooo.tw__char_count);
        this.f22242OooO0oo = (Button) findViewById(o00Ooo.tw__post_tweet);
        this.f22237OooO = (ObservableScrollView) findViewById(o00Ooo.tw__composer_scroll_view);
        this.f22243OooOO0 = findViewById(o00Ooo.tw__composer_profile_divider);
        this.f22245OooOO0o = (ImageView) findViewById(o00Ooo.tw__image_view);
        int i = 1;
        this.f22240OooO0o0.setOnClickListener(new o00000(this, i));
        this.f22242OooO0oo.setOnClickListener(new o00000O0(this, i));
        this.f22239OooO0o.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0OOOOo.o000oOoO
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                ComposerView composerView = this.f43662OooO00o;
                ((OooO00o.OooO0O0) composerView.f22247OooOOO0).OooO00o(composerView.getTweetText());
                return true;
            }
        });
        this.f22239OooO0o.addTextChangedListener(new OooO00o());
        this.f22237OooO.setScrollViewListener(new o0OoOo0(this));
    }

    public void setCallbacks(com.twitter.sdk.android.tweetcomposer.OooO00o.InterfaceC0281OooO00o interfaceC0281OooO00o) {
        this.f22247OooOOO0 = interfaceC0281OooO00o;
    }

    public void setCharCount(int i) {
        this.f22241OooO0oO.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i)));
    }

    public void setCharCountTextStyle(int i) {
        this.f22241OooO0oO.setTextAppearance(getContext(), i);
    }

    public void setImageView(Uri uri) {
        if (this.f22246OooOOO != null) {
            this.f22245OooOO0o.setVisibility(0);
            Picasso picasso = this.f22246OooOOO;
            picasso.getClass();
            new com.squareup.picasso.oo000o(picasso, uri).OooO0O0(this.f22245OooOO0o, null);
        }
    }

    public void setProfilePhotoView(User user) {
        String strOooO00o = UserUtils.OooO00o(user, UserUtils.AvatarSize.REASONABLY_SMALL);
        Picasso picasso = this.f22246OooOOO;
        if (picasso != null) {
            com.squareup.picasso.oo000o oo000oVarOooO0Oo = picasso.OooO0Oo(strOooO00o);
            oo000oVarOooO0Oo.f21854OooO0o0 = this.f22244OooOO0O;
            oo000oVarOooO0Oo.OooO0O0(this.f22238OooO0Oo, null);
        }
    }

    public void setTweetText(String str) {
        this.f22239OooO0o.setText(str);
    }

    public ComposerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o(context);
    }

    public ComposerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o(context);
    }
}
