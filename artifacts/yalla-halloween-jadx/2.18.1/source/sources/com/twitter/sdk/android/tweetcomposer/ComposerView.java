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
import com.facebook.appevents.ml.OooO;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.o000oOoO;
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
import java.util.Objects;
import java.util.regex.Matcher;
import p432o0OoOO00.o00O0O;
import p437o0OoOOOo.o0O0O0Oo;
import p437o0OoOOOo.o0O0OOO0;
import p437o0OoOOOo.o0O0OOOo;
import p437o0OoOOOo.o0O0o000;
import p437o0OoOOOo.o0O0oo0o;
import p437o0OoOOOo.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
public class ComposerView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f20063Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ImageView f20064Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageView f20065Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public EditText f20066Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ColorDrawable f20067OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ObservableScrollView f20068OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Button f20069OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View f20070OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ImageView f20071OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Picasso f20072OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public com.twitter.sdk.android.tweetcomposer.OooO00o.InterfaceC0181OooO00o f20073o000oOoO;

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
            com.twitter.sdk.android.tweetcomposer.OooO00o.InterfaceC0181OooO00o interfaceC0181OooO00o = composerView.f20073o000oOoO;
            String tweetText = composerView.getTweetText();
            com.twitter.sdk.android.tweetcomposer.OooO00o.OooO0O0 oooO0O0 = (com.twitter.sdk.android.tweetcomposer.OooO00o.OooO0O0) interfaceC0181OooO00o;
            com.twitter.sdk.android.tweetcomposer.OooO00o oooO00o = com.twitter.sdk.android.tweetcomposer.OooO00o.this;
            Objects.requireNonNull(oooO00o);
            boolean z = false;
            if (TextUtils.isEmpty(tweetText)) {
                iCodePointCount = 0;
            } else {
                com.twitter.OooO00o oooO00o2 = oooO00o.f20079OooO0o0.f20081OooO00o;
                Objects.requireNonNull(oooO00o2);
                String strNormalize = Normalizer.normalize(tweetText, Normalizer.Form.NFC);
                iCodePointCount = strNormalize.codePointCount(0, strNormalize.length());
                Objects.requireNonNull(oooO00o2.f19936OooO00o);
                if (strNormalize.length() == 0 || strNormalize.indexOf(46) == -1) {
                    EmptyList = Collections.emptyList();
                } else {
                    EmptyList = new ArrayList();
                    Matcher matcher = o00O0O.f39915OooO00o.matcher(strNormalize);
                    while (matcher.find()) {
                        if (matcher.group(4) != null || !o00O0O.f39917OooO0OO.matcher(matcher.group(2)).matches()) {
                            String strGroup = matcher.group(3);
                            int iStart = matcher.start(3);
                            int iEnd = matcher.end(3);
                            Matcher matcher2 = o00O0O.f39916OooO0O0.matcher(strGroup);
                            if (matcher2.find()) {
                                strGroup = matcher2.group();
                                iEnd = strGroup.length() + iStart;
                            }
                            EmptyList.add(new Extractor.Entity(iStart, iEnd, strGroup, Extractor.Entity.Type.URL));
                        }
                    }
                }
                for (Extractor.Entity entity : EmptyList) {
                    int i = (entity.f19932OooO00o - entity.f19933OooO0O0) + iCodePointCount;
                    entity.f19934OooO0OO.toLowerCase().startsWith("https://");
                    iCodePointCount = i + 23;
                }
            }
            com.twitter.sdk.android.tweetcomposer.OooO00o.this.f20075OooO00o.setCharCount(140 - iCodePointCount);
            if (iCodePointCount > 140) {
                com.twitter.sdk.android.tweetcomposer.OooO00o.this.f20075OooO00o.setCharCountTextStyle(o0O0o000.tw__ComposerCharCountOverflow);
            } else {
                com.twitter.sdk.android.tweetcomposer.OooO00o.this.f20075OooO00o.setCharCountTextStyle(o0O0o000.tw__ComposerCharCount);
            }
            ComposerView composerView2 = com.twitter.sdk.android.tweetcomposer.OooO00o.this.f20075OooO00o;
            if (iCodePointCount > 0 && iCodePointCount <= 140) {
                z = true;
            }
            composerView2.f20069OoooO00.setEnabled(z);
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
        this.f20072OoooOOO = Picasso.OooO0o(getContext());
        this.f20067OoooO = new ColorDrawable(context.getResources().getColor(o0O0OOO0.tw__composer_light_gray));
        View.inflate(context, oo0OOoo.tw__composer_view, this);
    }

    public String getTweetText() {
        return this.f20066Oooo0oo.getText().toString();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f20064Oooo0o = (ImageView) findViewById(o0O0OOOo.tw__author_avatar);
        this.f20065Oooo0oO = (ImageView) findViewById(o0O0OOOo.tw__composer_close);
        this.f20066Oooo0oo = (EditText) findViewById(o0O0OOOo.tw__edit_tweet);
        this.f20063Oooo = (TextView) findViewById(o0O0OOOo.tw__char_count);
        this.f20069OoooO00 = (Button) findViewById(o0O0OOOo.tw__post_tweet);
        this.f20068OoooO0 = (ObservableScrollView) findViewById(o0O0OOOo.tw__composer_scroll_view);
        this.f20070OoooO0O = findViewById(o0O0OOOo.tw__composer_profile_divider);
        this.f20071OoooOO0 = (ImageView) findViewById(o0O0OOOo.tw__image_view);
        int i = 0;
        this.f20065Oooo0oO.setOnClickListener(new o0O0O0Oo(this, i));
        this.f20069OoooO00.setOnClickListener(new o0O0oo0o(this, i));
        this.f20066Oooo0oo.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0OoOOOo.o0O0O0o0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                ComposerView composerView = this.f40086OooO00o;
                ((OooO00o.OooO0O0) composerView.f20073o000oOoO).OooO00o(composerView.getTweetText());
                return true;
            }
        });
        this.f20066Oooo0oo.addTextChangedListener(new OooO00o());
        this.f20068OoooO0.setScrollViewListener(new OooO(this, 1));
    }

    public void setCallbacks(com.twitter.sdk.android.tweetcomposer.OooO00o.InterfaceC0181OooO00o interfaceC0181OooO00o) {
        this.f20073o000oOoO = interfaceC0181OooO00o;
    }

    public void setCharCount(int i) {
        this.f20063Oooo.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i)));
    }

    public void setCharCountTextStyle(int i) {
        this.f20063Oooo.setTextAppearance(getContext(), i);
    }

    public void setImageView(Uri uri) {
        if (this.f20072OoooOOO != null) {
            this.f20071OoooOO0.setVisibility(0);
            Picasso picasso = this.f20072OoooOOO;
            Objects.requireNonNull(picasso);
            new o000oOoO(picasso, uri).OooO0O0(this.f20071OoooOO0, null);
        }
    }

    public void setProfilePhotoView(User user) {
        String strOooO00o = UserUtils.OooO00o(user, UserUtils.AvatarSize.REASONABLY_SMALL);
        Picasso picasso = this.f20072OoooOOO;
        if (picasso != null) {
            o000oOoO o000ooooOooO0Oo = picasso.OooO0Oo(strOooO00o);
            o000ooooOooO0Oo.f19819OooO0o0 = this.f20067OoooO;
            o000ooooOooO0Oo.OooO0O0(this.f20064Oooo0o, null);
        }
    }

    public void setTweetText(String str) {
        this.f20066Oooo0oo.setText(str);
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
