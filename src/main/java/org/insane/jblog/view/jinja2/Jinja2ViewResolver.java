package org.insane.jblog.view.jinja2;

import org.springframework.web.servlet.view.AbstractTemplateViewResolver;

/**
 * Convenience subclass of
 * {@link org.springframework.web.servlet.view.UrlBasedViewResolver} that
 * supports {@link Jinja2View} (i.e. Jinja2 templates) and custom subclasses of
 * it.
 *
 * <p>
 * The view class for all views generated by this resolver can be specified via
 * the "viewClass" property. See UrlBasedViewResolver's javadoc for details.
 *
 * <p>
 * <b>Note:</b> When chaining ViewResolvers, a Jinja2ViewResolver will check for
 * the existence of the specified template resources and only return a non-null
 * View object if the template was actually found.
 *
 * @author Artem Osadchyi
 * @since 30.07.2015
 * @see #setViewClass
 * @see #setPrefix
 * @see #setSuffix
 * @see #setRequestContextAttribute
 * @see #setExposeSpringMacroHelpers
 * @see Jinja2View
 */
public class Jinja2ViewResolver extends AbstractTemplateViewResolver {

    public Jinja2ViewResolver() {
        setViewClass(requiredViewClass());
    }

    /**
     * Requires {@link Jinja2View}.
     */
    @Override
    protected Class<?> requiredViewClass() {
        return Jinja2View.class;
    }

}
