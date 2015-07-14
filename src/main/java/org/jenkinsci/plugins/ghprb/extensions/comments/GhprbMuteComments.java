package org.jenkinsci.plugins.ghprb.extensions.comments;

import hudson.Extension;

import org.jenkinsci.plugins.ghprb.extensions.GhprbExtension;
import org.jenkinsci.plugins.ghprb.extensions.GhprbExtensionDescriptor;
import org.jenkinsci.plugins.ghprb.extensions.GhprbProjectExtension;
import org.kohsuke.stapler.DataBoundConstructor;

public class GhprbMuteComments extends GhprbExtension implements GhprbProjectExtension {

    @Extension
    public static final DescriptorImpl DESCRIPTOR = new DescriptorImpl();
    
    @DataBoundConstructor
    public GhprbMuteComments() {
        
    }
    
    @Override
    public DescriptorImpl getDescriptor() {
        return DESCRIPTOR;
    }
    

    public static final class DescriptorImpl extends GhprbExtensionDescriptor implements GhprbProjectExtension {

        @Override
        public String getDisplayName() {
            return "Mute all comments to the pull request";
        }
    }
}
