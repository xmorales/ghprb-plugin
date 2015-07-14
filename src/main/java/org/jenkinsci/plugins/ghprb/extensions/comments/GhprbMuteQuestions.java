package org.jenkinsci.plugins.ghprb.extensions.comments;

import hudson.Extension;

import org.jenkinsci.plugins.ghprb.extensions.GhprbExtension;
import org.jenkinsci.plugins.ghprb.extensions.GhprbExtensionDescriptor;
import org.jenkinsci.plugins.ghprb.extensions.GhprbGlobalExtension;
import org.jenkinsci.plugins.ghprb.extensions.GhprbProjectExtension;
import org.kohsuke.stapler.DataBoundConstructor;

public class GhprbMuteQuestions extends GhprbExtension implements GhprbProjectExtension {

    @Extension
    public static final DescriptorImpl DESCRIPTOR = new DescriptorImpl();
    
    @DataBoundConstructor
    public GhprbMuteQuestions() {
        
    }
    

    @Override
    public DescriptorImpl getDescriptor() {
        return DESCRIPTOR;
    }
    

    public static final class DescriptorImpl extends GhprbExtensionDescriptor implements GhprbProjectExtension {

        @Override
        public String getDisplayName() {
            return "Mute question comments to the pull request";
        }
    }

}
