package androidx.compose.compiler.plugins.kotlin.k2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.lang.LighterASTNode;
import org.jetbrains.kotlin.com.intellij.openapi.util.TextRange;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.util.diff.FlyweightCapableTreeStructure;
import org.jetbrains.kotlin.diagnostics.LightTreePositioningStrategies;
import org.jetbrains.kotlin.diagnostics.LightTreePositioningStrategiesKt;
import org.jetbrains.kotlin.diagnostics.LightTreePositioningStrategy;
import org.jetbrains.kotlin.diagnostics.LightTreePositioningStrategyKt;
import org.jetbrains.kotlin.diagnostics.OffsetsOnlyPositioningStrategy;
import org.jetbrains.kotlin.diagnostics.PositioningStrategies;
import org.jetbrains.kotlin.diagnostics.PositioningStrategy;
import org.jetbrains.kotlin.diagnostics.PositioningStrategyKt;
import org.jetbrains.kotlin.diagnostics.SourceElementPositioningStrategy;
import org.jetbrains.kotlin.lexer.KtTokens;
import org.jetbrains.kotlin.psi.KtNamedDeclaration;
import org.jetbrains.kotlin.psi.KtTryExpression;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposeSourceElementPositioningStrategies;", "", "()V", "DECLARATION_NAME_OR_DEFAULT", "Lorg/jetbrains/kotlin/diagnostics/SourceElementPositioningStrategy;", "getDECLARATION_NAME_OR_DEFAULT", "()Lorg/jetbrains/kotlin/diagnostics/SourceElementPositioningStrategy;", "LIGHT_TREE_TRY_KEYWORD", "Lorg/jetbrains/kotlin/diagnostics/LightTreePositioningStrategy;", "PSI_DECLARATION_NAME_OR_DEFAULT", "Lorg/jetbrains/kotlin/diagnostics/PositioningStrategy;", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "PSI_TRY_KEYWORD", "Lorg/jetbrains/kotlin/psi/KtTryExpression;", "TRY_KEYWORD", "getTRY_KEYWORD", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeSourceElementPositioningStrategies {

    @NotNull
    private static final SourceElementPositioningStrategy DECLARATION_NAME_OR_DEFAULT;

    @NotNull
    public static final ComposeSourceElementPositioningStrategies INSTANCE = new ComposeSourceElementPositioningStrategies();

    @NotNull
    private static final LightTreePositioningStrategy LIGHT_TREE_TRY_KEYWORD;

    @NotNull
    private static final PositioningStrategy<PsiElement> PSI_DECLARATION_NAME_OR_DEFAULT;

    @NotNull
    private static final PositioningStrategy<KtTryExpression> PSI_TRY_KEYWORD;

    @NotNull
    private static final SourceElementPositioningStrategy TRY_KEYWORD;

    static {
        PositioningStrategy<KtTryExpression> positioningStrategy = new PositioningStrategy<KtTryExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.k2.ComposeSourceElementPositioningStrategies$PSI_TRY_KEYWORD$1
            @NotNull
            public List<TextRange> mark(@NotNull KtTryExpression element) {
                PsiElement tryKeyword = element.getTryKeyword();
                return tryKeyword != null ? PositioningStrategyKt.markElement(tryKeyword) : PositioningStrategies.DEFAULT.mark((PsiElement) element);
            }
        };
        PSI_TRY_KEYWORD = positioningStrategy;
        LightTreePositioningStrategy lightTreePositioningStrategy = new LightTreePositioningStrategy() { // from class: androidx.compose.compiler.plugins.kotlin.k2.ComposeSourceElementPositioningStrategies$LIGHT_TREE_TRY_KEYWORD$1
            @NotNull
            public List<TextRange> mark(@NotNull LighterASTNode node, int startOffset, int endOffset, @NotNull FlyweightCapableTreeStructure<LighterASTNode> tree) {
                LighterASTNode lighterASTNodeFindChildByType = LightTreePositioningStrategiesKt.findChildByType(tree, node, KtTokens.TRY_KEYWORD);
                if (lighterASTNodeFindChildByType == null) {
                    lighterASTNodeFindChildByType = node;
                }
                return LightTreePositioningStrategyKt.markElement(lighterASTNodeFindChildByType, startOffset, endOffset, tree, node);
            }
        };
        LIGHT_TREE_TRY_KEYWORD = lightTreePositioningStrategy;
        PositioningStrategy<PsiElement> positioningStrategy2 = new PositioningStrategy<PsiElement>() { // from class: androidx.compose.compiler.plugins.kotlin.k2.ComposeSourceElementPositioningStrategies$PSI_DECLARATION_NAME_OR_DEFAULT$1
            @NotNull
            public List<TextRange> mark(@NotNull PsiElement element) {
                return element instanceof KtNamedDeclaration ? PositioningStrategies.DECLARATION_NAME.mark(element) : PositioningStrategies.DEFAULT.mark(element);
            }
        };
        PSI_DECLARATION_NAME_OR_DEFAULT = positioningStrategy2;
        TRY_KEYWORD = new SourceElementPositioningStrategy(lightTreePositioningStrategy, positioningStrategy, (OffsetsOnlyPositioningStrategy) null, 4, (DefaultConstructorMarker) null);
        DECLARATION_NAME_OR_DEFAULT = new SourceElementPositioningStrategy(LightTreePositioningStrategies.INSTANCE.getDECLARATION_NAME(), positioningStrategy2, (OffsetsOnlyPositioningStrategy) null, 4, (DefaultConstructorMarker) null);
    }

    private ComposeSourceElementPositioningStrategies() {
    }

    @NotNull
    public final SourceElementPositioningStrategy getDECLARATION_NAME_OR_DEFAULT() {
        return DECLARATION_NAME_OR_DEFAULT;
    }

    @NotNull
    public final SourceElementPositioningStrategy getTRY_KEYWORD() {
        return TRY_KEYWORD;
    }
}
